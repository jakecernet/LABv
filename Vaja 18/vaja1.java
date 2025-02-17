/*
 * Dan je program s katerim kreiramo nekaj primerov objektov. Na označeni točki dodajte
 * izpise (vsebine) vseh objektov, ki so nastali v programu pred to točko in
 * odgovorite na spodnja vprašanja.
 * 
 * Dopolnite:
 * V gornjem primeru kreiramo 3 objekte. Ti objekti so poimenovani _oi_, _oa_, _scan_.
 * Objekt dejansko nastane s tem, ko se pojavi v pomnilniku po tem, ko izvedemo
 * kreiranje z uporabo operatorja _new_.
 */

import java.util.Scanner;

public class vaja1 {
    public static void main(String[] args) {
        Integer oi; // deklaracija reference
        oi = new Integer(121); // ustvarjanje objekta (z rezervacijo prostora v pomnilniku)

        int[] oa; // deklaracija oz. najava
        oa = new int[10]; // kreiranje objekta
        // ---- vstavi izpis objektov
        System.out.println("Vsebina objekta oi: " + oi);
        System.out.print("Vsebina objekta oa: ");
        for (int i = 0; i < oa.length; i++) {
            System.out.print(oa[i] + " ");
        }
        System.out.println();

        System.out.println("zaključite z ENTER");
        Scanner scan; // deklaracija
        scan = new Scanner("System.in"); // kreiranje objekta

        scan.next();

        scan.close();
    }
}