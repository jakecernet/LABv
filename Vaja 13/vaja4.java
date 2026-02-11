/*  
    Metodi razreda MojeMetodeZaTabele z imenoma getIntTab/1 in genCharTab/1 vrneta tabelo
    ustreznega tipa (glej ime metode) in sicer tako dolgo, kot je vrednost argumenta tabele. Vrnjeni
    tabeli sta napolnjeni z naključnimi vrednostmi iz obsega int oz. iz množice znakov/simbolov za črke in
    številke.
    Za kontrolo delovanja v razred dodajte še metodi za izpis vrednosti elementov tabel: izpisiTab/1. Pri
    prvi je tako argument tabela int-ov, pri drugi tabela char-ov.
    Preskusite še : System.out.println( java.util.Arrays.toString(tab) )
*/

public class vaja4 {
    public static void main(String[] args) {
        int[] tab1 = new int[Integer.parseInt(args[0])];
        char[] tab2 = new char[Integer.parseInt(args[0])];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * Integer.MAX_VALUE);
            tab2[i] = (char) (Math.random() * 160 - 33);
        }

        System.out.println();
        izpisiTab(tab1);
        System.out.println();
        System.out.println();
        izpisiTab(tab2);
        System.out.println();
    }

    public static void izpisiTab(int[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
    }

    public static void izpisiTab(char[] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print(tabela[i] + " ");
        }
    }
}
