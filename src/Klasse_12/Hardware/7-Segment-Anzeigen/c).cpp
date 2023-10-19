#include "mbed.h"

const char anzeigeTabelle[10] = {0x3F, 0x06, 0x5B, 0x4F, 0x66, 0x6D, 0x7D, 0x07, 0x7F, 0x6F};

PortOut anzeige(PortC, 0xFF);
DigitalIn taster(PA_10);
DigitalOut einerStelle(PC_11);
int z;

int main() {
    taster.mode(PullDown);
    while(true){
        einerStelle = 1;
        if(taster){
            z++;
            if(z > 9){
                z = 0;
            }
            anzeige = anzeigeTabelle[z];
            while (taster){
                ThisThread::sleep_for(10);
            }
            
        }
    }
    
}