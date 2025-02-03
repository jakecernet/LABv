
/* 
    Napišite program, ki dobi celo število. Program števke prebranega števila zapiše v tabelo šetnajstih znakov tako, da so 
desno poravnane. V preostale celice tabele naj se vpišejo presledki.
Primer:
če je vneseno/prebrano št. 1524, naj bo vsebina tabele:
----------------------------------------------------------------
|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|'1'|'5'|'2'|'4'|
-----------------------------------------------------------------
pri negativni vrednosi -10599, naj bo vsebina tabele:
-----------------------------------------------------------------
|' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|'-'|'1'|'0'|'5'|'9'|'9'|
-----------------------------------------------------------------
*/
import java.util.Scanner;

public class vaja2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer stevilo = sc.nextInt();
        char[] tabela = new char[16];
        int stevec = 15;
        boolean isNegative = false;

        if (stevilo < 0) {
            isNegative = true;
        }

        while (stevilo != 0) {
            tabela[stevec] = stevilo.toString().charAt(stevilo.toString().length() - 1);
            stevilo /= 10;
            stevec--;
        }

        if (isNegative) {
            tabela[stevec] = '-';
            stevec--;
        }

        izpisi(tabela);

        sc.close();
    }

    public static void izpisi(char[] tabela) {
        for (int i = 32; i >= 0; i--) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("|");
            if (tabela[i] == 0) {
                System.out.print(" ");
            } else {
                System.out.print(tabela[i]);
            }
        }
        System.out.println("|");
        for (int i = 32; i >= 0; i--) {
            System.out.print("-");
        }
        System.out.println();

    }
}
