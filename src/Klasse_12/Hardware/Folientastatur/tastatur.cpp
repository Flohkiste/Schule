#include "LCD.h"
lcd mylcd;

void ausgabe(unsigned int i)
{
    mylcd.cls();
    mylcd.locate(0,0);
    mylcd.printf("Taste %d", i);
    wait(0.5);
}

int main()
{
    PortIn spalten(PortB, 0x0F);
    PortInOut zeilen(PortB, 0xF0);
    
    spalten.mode(PullUp);
    zeilen.output();
    zeilen.mode(OpenDrain);

    while (true) {
        zeilen = 0b11101111;
        for (int i = 0; i < 3; i++)
        {
            zeilen = ~(1 << i);
            for (int j = 0; j < 4; j++)
            {
                if (spalten & (1 << j))
                {
                    ausgabe(i*4+j);
                }
            }
        
        }
        
    }
}
