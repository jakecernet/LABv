/* 
 * Tema:
 * Homogena podatkovna struktura – enorazsežna/1D tabela
 * Vsebine:
 * Deklaracija tabele
 * Rezervacija prostora za elemente tabele
 * Lastnosti tabele
 * Inicializacija
 * Dostop do elementov tabele
 * 
 * Naloga 7
 * Spišite razredno metodo, ki ji s klicem posredujete celoštevilsko vrednost s pomenom letnice rojstva. Metoda v tabelo štirih celih števil vpišite števke, ki se nahajajo v letnici rojstva. Nato oba podatka , letnico in tabelo, zaporedno izpiše v naslednji obliki:
 * Letnica rojstva: 1995
 * Razčlenjena letnica rojstva: 1 – 9 – 9 – 5
 * 
 * 

 */

public class vaja {
    public static void main(String[] args) {
        // Naloga 1
        int i = 5; // deklarira spremenljivko i in ji dodeli vrednost 5
        int[] t; // deklarira tabelo t
        t = new int[5]; // rezervira prostor za 5 elementov tabele
        System.out.println(t[0]); // izpiše vrednost prvega elementa tabele
        System.out.println(t.length); // izpiše število elementov v tabeli
        t[t.length - 3] = 5; // v srednji element tabele vpiše vrednost 5

        // Naloga 2
        t = new int[12]; // rezervira prostor za 12 elementov tabele
        // t[12] = 12; //neuspešno, ker je zadnji element tabele t[11]
        // t[-2] = 12; //neuspešno, ker indeks ne more biti negativen

        // Naloga 3
        char[] znaki; // deklarira tabelo znakov
        int[] stevila = new int[12]; // ustvari tabelo celih števil z dvanajstimi elementi
        char[] znaki2 = new char[10]; // rezervira prostor za 10 celih števil v tabeli znakov
        boolean[] logika; // deklarira tabelo logičnih vrednosti
        logika = new boolean[15]; // rezervira prostor v pomnilniku velikosti 15
        for (int j = 0; j < logika.length; j++) {
            logika[j] = false; // inicializira tabelo logičnih vrednosti, da bodo vsi elementi imeli vrednost
                               // false
        }
        logika[logika.length - 1] = true; // zadnji element dobi vrednost true
        double[] necela = { 12.5, 3.33, 4.0, 12, 31.13 }; // ustvari tabelo necelih števil

        // Naloga 4
        int[] it = new int[5];
        boolean[] bt = new boolean[5];
        System.out.println("Prvi element tabele it: " + it[0]);
        System.out.println("Zadnji element tabele it: " + it[it.length - 1]);
        System.out.println("Prvi element tabele bt: " + bt[0]);
        System.out.println("Zadnji element tabele bt: " + bt[bt.length - 1]);

        // Naloga 5
        int[] zaporedje = new int[10];
        zaporedje[0] = 5;
        zaporedje[1] = 10;
        for (int j = 2; j < zaporedje.length; j++) {
            zaporedje[j] = zaporedje[j - 1] * 2 + zaporedje[j - 2];
        }
        for (int j = 0; j < zaporedje.length; j++) {
            System.out.println(zaporedje[j]);
        }

        // Naloga 6
        char[] samoglasniki = { 'a', 'e', 'i', 'o', 'u' };
        char[] tab = new char[20];
        for (int j = 0; j < tab.length; j++) {
            tab[j] = samoglasniki[(int) (Math.random() * 5)];
        }
        for (int j = 0; j < tab.length; j++) {
            System.out.print(tab[j]);
        }
        System.out.println();
        System.out.println("Prva črka: " + tab[0]);
        System.out.println("Zadnja črka: " + tab[tab.length - 1]);

        // Naloga 7
        razcleniLetnico(1995);
    }

    public static void razcleniLetnico(int leto) {
        int[] tabela = new int[4];
        for (int j = 0; j < tabela.length; j++) {
            tabela[j] = leto % 10;
            leto /= 10;
        }
        System.out.println("Letnica rojstva: " + leto);
        for (int j = tabela.length - 1; j >= 0; j--) {
            System.out.print(tabela[j] + " - ");
        }
        System.out.println();
    }

    // Naloga 8
    public static void vpisiCrke(int velikost) {
        char[] tab = new char[velikost];
        char[] samoglasniki = { 'a', 'e', 'i', 'o', 'u' };
        char[] soglasniki = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
                'x', 'y', 'z' };
        for (int j = 0; j < tab.length; j++) {
            if (j % 2 == 0) {
                tab[j] = samoglasniki[(int) (Math.random() * 5)];
            } else {
                tab[j] = soglasniki[(int) (Math.random() * 21)];
            }
        }
        for (int j = 0; j < tab.length; j++) {
            System.out.print(tab[j]);
        }
        System.out.println();
    }

    // Naloga 9
    public static void naloga9() {
        int[] t1 = { 1, 2, 3, 4 };
        int[] t2 = t1;
        t2[1] = 6;
        t2[3] = 9;
        int i = 0;
        System.out.print("Prva tabela: ");
        for (i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
        System.out.println();
        System.out.print("Druga tabela: ");
        for (i = 0; i < t2.length; i++) {
            System.out.print(t2[i] + " ");
        }
    }

    // Naloga 10
    public static void naloga10() {
        int n = (int) (Math.random() * 10) + 25;
        String[] uspehi = { "nzd", "zd", "db", "pd", "odl", "neoc" };
        String[] dijaki = new String[n];
        for (int j = 0; j < dijaki.length; j++) {
            dijaki[j] = uspehi[(int) (Math.random() * 6)];
        }
        int nzd = 0, zd = 0, db = 0, pd = 0, odl = 0, neoc = 0;
        for (int j = 0; j < dijaki.length; j++) {
            switch (dijaki[j]) {
                case "nzd":
                    nzd++;
                    break;
                case "zd":
                    zd++;
                    break;
                case "db":
                    db++;
                    break;
                case "pd":
                    pd++;
                    break;
                case "odl":
                    odl++;
                    break;
                case "neoc":
                    neoc++;
                    break;
            }
        }
        System.out.println("Uspehi: ");
        System.out.println("Nezadostni: " + nzd);
        System.out.println("Zadostni: " + zd);
        System.out.println("Dobri: " + db);
        System.out.println("Pravdobri: " + pd);
        System.out.println("Odlični: " + odl);
        System.out.println("Neocenjeni: " + neoc);
    }
}