/* mbed Microcontroller Library
 * Copyright (c) 2019 ARM Limited
 * SPDX-License-Identifier: Apache-2.0
 */
#include "mbed.h"
#include "platform/mbed_thread.h"
#include "LCD.h"
#include <string>
#undef __ARM_FP

enum Zustand{WARTEN, HEBEN, OBEN, SENKEN};
int aktZustand=WARTEN;
DigitalIn pe(PA_1), ob(PA_6), es(PA_10), un(PB_0);
DigitalOut mauf(PC_0), mab(PC_1);
InterruptIn ls(PB_3);

lcd mylcd;
string zustandStr[] = {"Warten", "Heben", "Oben", "Senken"};

void isrLS(){
    ls.disable_irq();
    if (aktZustand == SENKEN){
        aktZustand = HEBEN;
    }
    ls.enable_irq();
}

void motorenAus(){
    mauf = 0;
    mab = 0;
}

void init(void)
{

    mylcd.clear();

    pe.mode(PullDown);
    ob.mode(PullDown);
    es.mode(PullDown);
    un.mode(PullDown);

    ls.mode(PullDown);
    ls.rise(&isrLS);
    ls.enable_irq();

}

int main()
{
    init();

    while (true) {

        mylcd.cursorpos(0);

        switch (aktZustand) {
            case WARTEN:
                if (pe == 1) {
                    aktZustand = HEBEN;
                }
                motorenAus();
                mylcd.printf("Warten    ");
            break;

            case HEBEN:
                if (ob == 1){
                    aktZustand = OBEN;
                }
                mab = 0;
                mauf = 1;
                mylcd.printf("Heben     ");
            break;

            case OBEN:
                if (es == 1){
                    aktZustand = SENKEN;
                }
                motorenAus();
                mylcd.printf("Oben      ");
            break;

            case SENKEN:
                if(un == 1){
                    aktZustand = WARTEN;
                }
                mauf = 0;
                mab = 1;
                mylcd.printf("Senken    ");
            break;

        }


    }
}
