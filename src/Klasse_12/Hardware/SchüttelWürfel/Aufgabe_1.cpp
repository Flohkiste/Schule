#include "mbed.h"
#include "LCD.h"
lcd myLCD;

int main(){
    DigtalIn vibrationsSensor(PB_0);
    PortOut ausgabe(PortC, 0x07);
    vibrationsSensor.mode(PullDown);
    int zaehler = 0;

    

    while(true){
        
        while(vibrationsSensor){
            zaehler++;
            if(zaehler > 6){
                zaehler = 1;
            }
        }
        ausgabe = zaehler;
        myLCD.printf("Zahl: %i", zaehler);
        sleep_for(5000);
    }
}