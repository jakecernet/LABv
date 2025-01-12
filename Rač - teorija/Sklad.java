public class Sklad {
    public static int[] tab = new int[9];
    public static int kam = 0;

    public static void main(String[] args) {
        System.out.println(jePrazen());
        odstrani();
        System.out.println("izpis");
        izpis();
        for (int i = 0; i < 6; i++) {
            vstavi(i * 5 + 12);
            System.out.println("kam vstavljamo: " + vrh());
        }
        System.out.println("izpis");
        izpis();
        odstrani();
        izpis();
        odstrani();
        izpis();
        for (int i = 0; i < 6; i++) {
            vstavi(i * 3);
            System.out.println("kam vstavljamo: " + vrh());
        }
        izpis();
        odstrani();
        izpis();
    }

    public static void vstavi(int pod) {
        if (kam < tab.length) {
            tab[kam] = pod;
            kam = kam + 1;
        }
    }

    public static void odstrani() {
        if (!jePrazen()) {
            kam = kam - 1;
        } else {
            kam = 0;
        }
        tab[kam] = 0;
    }

    public static boolean jePrazen() {
        return (kam == 0);
    }

    public static int vrh() {
        if (!jePrazen()) {
            return kam - 1;
        } else {
            return -1;
        }
    }

    public static void izpis() {
        for (int i = 0; i < kam; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();
    }
}