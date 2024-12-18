/*  
    Napišite program, s katerim v tabelo t vpišete 12 naključnih velikih črk angleške abecede. Pri vnosu
    podatkov zagotovite, da bo vsebina tabele urejena naraščajoče. Nato izpišite ugotovitev, ali je v tabeli
    črka x. Črko x dobite z generatorjem naključnih števil.
        a) Uporabite linearno iskanje
        b) Uporabite binarno iskanje
    Po izvedbi vsakega izmed postopkov iskanja izpišite tudi število izvedenih primerjav.
*/

public class vaja4 {
    public static void main(String[] args) {
        char t[] = new char[12];
        for (int i = 0; i < t.length; i++) {
            t[i] = (char) (Math.random() * 26 + 65);
        }
        char x = (char) (Math.random() * 26 + 65);
        System.out.println("Iskana črka: " + x);
        System.out.println("Tabela:");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();

        System.out.println("Linearno iskanje:");
        int primerjave = 0;
        for (int i = 0; i < t.length; i++) {
            primerjave++;
            if (t[i] == x) {
                System.out.println("Najdena na indeksu: " + i);
                break;
            }
        }
        System.out.println("Število primerjav: " + primerjave);
        System.out.println();

        System.out.println("Binarno iskanje:");
        sortTab(t);
        System.out.println("Sortirana tabela:");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        int zacetek = 0;
        int konec = t.length - 1;
        int sredina = (zacetek + konec) / 2;
        primerjave = 0;
        while (zacetek <= konec) {
            primerjave++;
            if (t[sredina] == x) {
                System.out.println("Najdena na indeksu: " + sredina);
                break;
            } else if (t[sredina] < x) {
                zacetek = sredina + 1;
            } else {
                konec = sredina - 1;
            }
            sredina = (zacetek + konec) / 2;
        }
        System.out.println("Število primerjav: " + primerjave);
    }

    public static void sortTab(char[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    char temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
    }
}
