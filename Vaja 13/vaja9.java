/*  
    Metoda razreda tableLeftTrim/2 naj bo kopija skrajševanja z 'leve' strani tabele. Dodajte razredu
    metodi tableRightTrim/2, ki bosta počeli enako, le z 'desnega' konca tabele, ter metodi
    tableMidTrim/3, ki bo ohranila zgolj n-elementov od k-tega elementa v tabeli dalje
*/

public class vaja9 {
    public static void main(String[] args) {
        int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printTab(tableLeftTrim(tab, 2), tableRightTrim(tab, 2), tableMidTrim(tab, 3, 3));
    }

    public static int[] tableLeftTrim(int[] tab, int n) {
        int[] rez = new int[tab.length - n];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = tab[i + n];
        }
        return rez;
    }

    public static int[] tableRightTrim(int[] tab, int n) {
        int[] rez = new int[tab.length - n];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = tab[i];
        }
        return rez;
    }

    public static int[] tableMidTrim(int[] tab, int n, int k) {
        int[] rez = new int[n];
        for (int i = 0; i < n; i++) {
            rez[i] = tab[i + k];
        }
        return rez;
    }

    public static void printTab(int[] tab1, int[] tab2, int[] tab3) {
        System.out.println();
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < tab3.length; i++) {
            System.out.print(tab3[i] + " ");
        }
        System.out.println();
    }
}
