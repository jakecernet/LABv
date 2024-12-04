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
 * Naloga 1
 * Dana je sekvenca programskih stavkov:
 * int i=5;
 * int[] t;
 * t=new int[5];
 * System.out.println( t[0] );
 * System.out.println( t.length );
 * t[ t.length-3 ] = 5;
 * Ugotovite in označite : kateri stavek izpiše število elementov v tabeli, kateri v srednji element tabele vpiše vrednost 5, kateri izmed stavkov deklarira tabelo, kateri izmed stavkov predstavi  vrednost prve elementa tabele, kateri izmed stavkov rezervira prostor za 5 elementov tabele. Ugotovitve lahko zapišete v obliki komentarja desno od programskih stavkov.
 * 
 * Naloga 2
 * Recimo, da zaporedje iz naloge 1 razširimo z:
 * t = new int[12];
 * t[12] = 12;
 * t[-2] = 12;
 * Kateri izmed naštetih so lahko uspešni in kateri ne. Obrazložite.
 * 
 * Naloga 3
 * Deklarirajte tabelo znakov.
 * Ustvarite tabelo celih števil z dvanajstimi elementi. 
 * Rezervirajte prostor za 10 celih števil v tabeli znakov.
 * Deklarirajte tabelo logičnih vrednosti.
 * Za tabelo logičnih vrednosti rezervirajte prostor v pomnilniku velikosti 15.
 * Inicializirajte tabelo logičnih vrednosti, da bodo vsi elementi imeli vrednost false, zgolj zadnji vrednost true.
 * Ustvarite tabelo necelih števil z vrednostmi 12.5, 3.33, 4.0, 12 in 31.13
 * 
 * Naloga 4
 * Dani sta tabeli: 
 * int[] it = new int[5];
 * boolean[] bt = new boolean[5];
 * 
 * Spišite sekvenco stavkov, ki bo izpisala vrednosti prvega in zadnjega elementa obeh tabel. Kakšno so te vrednosti?
 * 
 * Naloga 5
 * Dano je zaporedje: 5, 10, 25, 60, 145, 350, ... . Napišite program, ki v tabelo vpiše prvih 10 elementov zaporedja in nato izpiše vsebino tabele od največjega do najmanjšega elementa. V zaporedju sta prva dva elementa dana, vse ostale pa je moč izračunati s pomočjo predhodnih dveh.
 * 
 * Naloga 6
 * a) Napišite program, s katerim v tabelo vpišete 20 naključnih samoglasnikov. Nato izpišite vsebino tabele, črko, ki se nahaja na začetku in črko, ki se nahaja na koncu tabele. 
 * b) Predelajte zgornji program tako, da bo velikost tabele neko naključno število iz intervala [10..20]. Nato izpišite vsebino tabele, črki, ki se nahajata na začetku tabele in črki, ki se nahajata na koncu tabele. Glej primer:
 * 
 * Slika 1 Oblika izpisa
 * 
 * Naloga 7
 * Spišite razredno metodo, ki ji s klicem posredujete celoštevilsko vrednost s pomenom letnice rojstva. Metoda v tabelo štirih celih števil vpišite števke, ki se nahajajo v letnici rojstva. Nato oba podatka , letnico in tabelo, zaporedno izpiše v naslednji obliki:
 * Letnica rojstva: 1995
 * Razčlenjena letnica rojstva: 1 – 9 – 9 – 5
 * 
 * Naloga 8
 * Razredni metodi s klicem posredujete velikost. Ta v izvajanju v tabelo znakov posredovane velikosti vpiše naključne črke po pravilu:
 * na lihih indeksih tabele morajo biti samoglasniki,
 * na sodih indeksih tabele morajo biti soglasniki.
 * Po končanem vpisu metoda izpiše vsebino tabele.
 * 
 * Naloga 9
 * a) Narišite pomnilniško sliko naslednjega programa.
 * public class MyClass {
 *     public static void main(String[] args) {
 *         int[] t1 = {1,2,3,4};
 *         int[] t2 = t1;
 *         t2[1]=6;
 *         t2[3]=9;
 *         int i=0;
 *         System.out.print("Prva tabela: ");
 *         for (i=0;i<t1.length;i++){
 *           System.out.print(t1[i]+ " ");
 *         }
 *         System.out.println();
 *         System.out.print("Druga tabela: ");
 *         for (i=0;i<t2.length;i++){
 *           System.out.print(t2[i]+ " ");
 *         }
 *     }
 * }
 * b) Kaj izpiše ta program?
 * c) Popravite program tako, da v resnici dela z dvema objektoma t1 in t2 oz. da bo vsebina tabele t1 1,2,3,4 in vsebina tabele t2 1,6,3,9.
 * Opomba: lahko si pomagata s programom Jeliot 3 za animacijo in vizualizacijo izvjanja javanskega programa.
 * 
 * Naloga 10
 * V nekem razredu je n dijakov. N je lahko celo število iz intervala [25..34]. Napišite program, ki omogoča vnos uspehov dijakov. Veljavni uspehi so: "nzd", "zd", "db", "pd", "odl" ali "neoc". Nato program izpiše posamezne uspehe in za vsak rang uspeha/uspeh število dijakov. Primer izpisa:
 * Uspehi: 2,1,1,1,3,3,3,3,3,3,4,4,4,4,2,4,5,5,neoc,5,....
 * Nezadostni: 3
 * Zadostni: 5
 * Dobri: 10
 * Pravdobri: 7
 * Odlični: 3
 * Neocenjeni: 2
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