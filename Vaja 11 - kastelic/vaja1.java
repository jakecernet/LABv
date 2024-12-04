/* 
 * Naloga 1
 * Dana je sekvenca programskih stavkov:
 * int i=5;
 * int[] t;
 * t=new int[5];
 * System.out.println( t[0] );
 * System.out.println( t.length );
 * t[ t.length-3 ] = 5;
 * Ugotovite in označite : kateri stavek izpiše število elementov v tabeli, kateri v srednji element tabele vpiše vrednost 5, 
 * kateri izmed stavkov deklarira tabelo, kateri izmed stavkov predstavi vrednost prve elementa tabele, kateri izmed stavkov rezervira prostor za 5 elementov tabele. 
 * Ugotovitve lahko zapišete v obliki komentarja desno od programskih stavkov.
*/

public class vaja1 {
    public static void main(String[] args) {
        int i = 5; // i je enako 5
        int[] t; // deklaracija tabele
        t = new int[5]; // rezervacija prostora za 5 elementov tabele
        System.out.println(t[0]); // izpis vrednosti prvega elementa tabele
        System.out.println(t.length); // izpis števila elementov v tabeli
        t[t.length - 3] = 5; // v srednji element tabele vpiše vrednost 5
    }
}
