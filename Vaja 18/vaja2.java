/*
 * Naloga 2
 * Dan je program, ki izkorišča definicijo razreda Integer kot generator objektov.
 * Definicja razreda služi kot predloga za objekte. Oglejte si ga in odgovorite na zahtevano spodaj.
 *
 * V izvedbi zgornjega programa (driver oz. zagonske metode) smo ustvari natanko __13__ objektov.
 * Ustvarjeni objekti so vrst: __Integer,_Scanner__.
 * Pri tem je bilo največ ustvarjenih objektov vrst __Integer__ in sicer smo jih naredili __12__ .
 */

import java.util.Scanner;
import java.util.Arrays;

/**
 * več objektov istega tipa
 * na osnovi razreda je možno ustvariti poljubno število objektov tega tipa
 */
public class vaja2 {
    public static void main(String[] args) {
        Integer oi1; // deklaracija (najava) reference
        oi1 = new Integer(121); // ustvarjanje objekta (z rezervacijo prostora v pomnilniku)
        Integer oi2; // deklaracija reference
        oi2 = new Integer(321);

        Integer[] toi; // deklaracija oz. najava
        toi = new Integer[10]; // kreiranje objekta (tabele)

        for (int i = 0; i < toi.length; i++) {
            toi[i] = new Integer(i);
        }

        System.out.println(Arrays.toString(toi));

        System.out.println("zaključite z ENTER");
        Scanner scan; // deklaracija
        scan = new Scanner("System.in"); // kreiranje objekta

        scan.next();

        scan.close();
    }
}