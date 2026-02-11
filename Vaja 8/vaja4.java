/* Program Naloga4 izriše okvir po zunanjem robu navideznega zaslona velikosti 80x25. Vogali so
predstavljeni z znaki '+', navpične črte z znaki '|', vodoravne pa z znaki '–'. */

public class vaja4 {
    public static void main(String[] args) {
        int visina = 25;
        int sirina = 80;
        int i, j;

        for (j = 0; j < sirina; j++) {
            if (j == 0 || j == sirina - 1) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        for (i = 0; i < visina - 2; i++) {
            System.out.print("|");
            for (j = 0; j < sirina - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for (j = 0; j < sirina; j++) {
            if (j == 0 || j == sirina - 1) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
