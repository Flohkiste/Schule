/* mbed Microcontroller Library
 * Copyright (c) 2019 ARM Limited
 * SPDX-License-Identifier: Apache-2.0
 */
#include "mbed.h"
#include "platform/mbed_thread.h"
#include "LCD.h"
#undef __ARM_FP

InterruptIn s(PA_1), takt(PA_6);
enum Zustand{Z0=0, Z1=1, Z2=2, Z3=3};
PortOut anzeige(PortC,0x7F);
DigitalOut anzeigeAn(PC_11);
DigitalOut freigabe(PC_7);
DigitalOut seg7On(PC_12);
lcd mylcd;

int aktZustand=Z0, nr=0;
int seg7[10]={0b00111111, 0b00000110, 0b01011011, 0b01001111, 0b01100110, 
                0b01101101, 0b01111101, 0b00000111, 0b01111111, 0b01101111};

void isr_hoch()
{

    s.disable_irq();
    while(s==1){}
    nr = (nr + 1) % 10;
    anzeige = seg7[nr];
    TIM6->CNT = 0;
    s.enable_irq();

}

void isr_weiter()
{

    if (aktZustand == Z0 && nr == 3){
        aktZustand = Z1;
    } else if (aktZustand == Z1 && nr == 1) {
        aktZustand = Z2;
    } else if (aktZustand == Z2 && nr == 7) {
        aktZustand = Z3;
    } else {
        aktZustand = Z0;
    }

}

void isrTIM6()
{

    TIM6->SR=0;
    HAL_NVIC_ClearPendingIRQ(TIM6_IRQn);
    nr = 0;
    aktZustand = Z0;

}

void init(void)
{
 
    freigabe = 0;

    s.mode(PullDown);
    takt.mode(PullDown);
    s.rise(&isr_hoch);
    takt.rise(&isr_weiter);
    s.enable_irq();
    takt.enable_irq();

    anzeigeAn = 1;

    //Timer
    RCC->APB1ENR |= 0b10000;
    TIM6->ARR = 5;
    TIM6->PSC = 0xFFFF;
    TIM6->CNT = 0;
    TIM6->SR = 0;
    TIM6->CR1 = 1;
    NVIC_SetVector(TIM6_IRQn,(uint32_t)&isrTIM6);


}

int main()
{
    init();

    while (true) {
        if (aktZustand==Z3) freigabe=1; 
        else freigabe=0;
        mylcd.cursorpos(0);
        mylcd.printf("Zustand= %d",aktZustand);
        thread_sleep_for(25);
    }
}
