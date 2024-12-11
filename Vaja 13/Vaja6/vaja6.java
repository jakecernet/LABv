/*  
    Poigrajte se z metod-o/ama iz Naloga 5; naredite kopijo metod v aliJeVTabeliTest/2. V kopijah
    dodajte števec, ki bo štel število primerjav pri iskanju ( izvedb if stavkov) in število izpisal pred
    izhodom iz metode (pred stavkom return). Nato naredite tabelo 12-tih elementov in jo izpišite na
    zaslon. In:
        a) Izvedite iskanje elementa, ki se nahaja na prvem mestu v tabeli. Zapišite število primerjav.
        b) Izvedite iskanje elementa, ki se nahaja na zadnjem metu v tabeli. Zapišite število primerjav.
        c) Izvedite iskanje elementa, ki se nahaja na sredini tabele(recimo na mestu 6). Zapišite število
           primerjav.
        d) Spišite test (metodo?), ki bo 1000x izvedla iskanje naključnega elementa iz tabele in
           izračunajte povprečno število primerjav. Zapišite to število.
    Vprašanja, na katera morate znati odgovoriti so:
        Kateri element najdalj iščemo v zaporedju (najdalj je: za katerega 'porabimo' največ primerjav(if-ov)?
        Katerega iščemo najmanj časa? Kolikšno je povprečje pri iskanju ? Kako je število primerjav odvisno
        od števila elementov v zaporedju ? logaritemsko, linearno, kvadratično, exponencialno
*/

public class vaja6 {
    public static void main(String[] args) {
        int[] tabela = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        System.out.println(aliJeVTabeli1(tabela, tabela[0]));
        System.out.println(aliJeVTabeli2(tabela, tabela[tabela.length - 1]));
        System.out.println(aliJeVTabeliTest(tabela, tabela[tabela.length / 2]));
    }

    public static int aliJeVTabeli1(int[] tabela, int iskana) {
        int primerjav = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskana) {
                primerjav++;
            }
        }
        return primerjav;
    }

    public static int aliJeVTabeliTest(int[] tabela, int iskana) {
        int primerjav = 0;
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskana) {
                primerjav++;
            }
        }
        return primerjav;
    }

    public static boolean aliJeVTabeli2(int[] tabela, int iskana) {
        boolean iskanje = false;
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] == iskana) {
                iskanje = true;
            }
        }
        return iskanje;
    }
}