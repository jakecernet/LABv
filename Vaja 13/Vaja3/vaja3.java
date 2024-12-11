/*  
    Naloga 3
    • Razredna metoda vrniVsoto/1 vrne vsoto elementov take tabele, kot je definirana v nalogi 1
    • Razredna metoda vrniVsoto/2 vrne vsoto (prvih) n elementov tabele, kot je podana v nalogi 1
    premislite : bo vrnjena vsota vrste int ali long ? Kdaj boste uporabili prvega, kdaj
    drugega. Pri vrniVsoto/2 je drugi argument število elementov, ki jih upoštevamo pri
    izračunu vsote. Če je ta nič, je vsota pač nič. Kaj pa če je njegova vrednost negativna?
    Hm, recimo, da potem upošteva v vsoti z-a-d-n-j-i-h n elementov v tabeli. In, če je
    elementov manj kot n, jih je v vsoti upoštevanih pač manj kot n.
    • Razredna metoda vrniVsoto/3 vrne vsoto n zaporednih elementov tabele, začenši s k-tim
    elementom tabele. (glejte predhodne opombe)
*/

public class vaja3 {
    public static void main(String[] args) {
        int[] tab1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(vrniVsoto(tab1, 0));
        System.out.println(vrniVsoto(tab1, 1, 6));
    }

    public static int vrniVsoto(int[] tabela, int k) {
        int vsota = 0;
        for (int i = 0; i < tabela.length; i++) {
            vsota += tabela[i];
        }
        return vsota;
    }

    public static int vrniVsoto(int[] tabela, int k, int n) {
        int vsota = 0;
        for (int i = 0; i < n; i++) {
            vsota += tabela[k + i];
        }

        return vsota;
    }
}
