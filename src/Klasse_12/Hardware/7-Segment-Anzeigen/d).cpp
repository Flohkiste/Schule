#include "mbed.h"

const char anzeigeTabelle[10] = {0x3F, 0x06, 0x5B, 0x4F, 0x66, 0x6D, 0x7D, 0x07, 0x7F, 0x6F};

PortOut anzeige(PortC, 0xFF);
DigitalIn taster(PA_10);
DigitalOut einerStelle(PC_11);
DigitalOut zehnerStelle(PC_12);
int z;
int y;

int main() {
    taster.mode(PullDown);
    while(true){
        if(taster){
            z++;
            if(z > 9){
                z = 0;
                y++;
                if (y > 9){
                    y = 0;
                }                
            }

            
            while (taster){
                einerStelle = 1;
                anzeige = anzeigeTabelle[z];
                einerStelle = 0;
                ThisThread::sleep_for(5);
                zehnerStelle = 1;
                anzeige = anzeigeTabelle[y];
                zehnerStelle = 0;
                thisThread::sleep_for(5);
            }
            
        }
        einerStelle = 1;
        anzeige = anzeigeTabelle[z];
        einerStelle = 0;
        ThisThread::sleep_for(5);
        zehnerStelle = 1;
        anzeige = anzeigeTabelle[y];
        zehnerStelle = 0;
        ThisThrest::sleep_for(5);

    }
    
}