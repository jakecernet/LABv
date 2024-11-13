/* 
    Opišite vlogo bitnih operatorjev >> in <<, opišite tudi, kaj spodnji program izpiše.

    Bitni operator >> premakne bite v desno za določeno število mest. 
    Bitni operator << premakne bite v levo za določeno število mest.

    Program izpiše:
    6 110 6
    12 1100 c
    24 11000 18

    Na prvem mestu je rezultat operacije, na drugem mestu je rezultat v binarni obliki, na tretjem mestu pa je rezultat v heksadecimalni obliki.
*/

public class vaja3 {
    public static void main(String[] args) {
        int a = 3;
        int rez;

        rez = a << 1;
        System.out.println(rez + " " + Integer.toString(rez, 2) + " " + String.format("%x", rez));

        rez = a << 2;
        System.out.println(rez + " " + Integer.toString(rez, 2) + " " + String.format("%x", rez));

        rez = a << 3;
        System.out.println(rez + " " + Integer.toString(rez, 2) + " " + Integer.toString(rez, 16));
    }
}
