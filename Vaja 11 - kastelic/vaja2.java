/*  
 * Naloga 2
 * Recimo, da zaporedje iz naloge 1 razširimo z:
 * t = new int[12];
 * t[12] = 12;
 * t[-2] = 12;
 * Kateri izmed naštetih so lahko uspešni in kateri ne. Obrazložite.
*/

public class vaja2 {
    public static void main(String[] args) {
        int i = 5;
        int[] t = new int[12];
        // t[12] = 12; //neuspešno, ker je zadnji element tabele t[11]
        // t[-2] = 12; //neuspešno, ker indeks ne more biti negativen
    }
}
