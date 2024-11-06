/* Program Naloga4 izriše okvir po zunanjem robu navideznega zaslona velikosti 80x25. Vogali so
predstavljeni z znaki '+', navpične črte z znaki '|', vodoravne pa z znaki '–'. */

public class java4 {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 80; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("+");
                } else if (i == 0 && j == 79) {
                    System.out.println("+");
                } else if (i == 24 && j == 0) {
                    System.out.print("+");
                } else if (i == 24 && j == 79) {
                    System.out.println("+");
                } else if (i == 0 || i == 24) {
                    System.out.print("-");
                } else if (j == 0 || j == 79) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
