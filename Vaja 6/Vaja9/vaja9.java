
/* Izdelaj program, ki bere znake in pri tem šteje pojavitve samoglasnikov. Vnos se konča, ko uporabnik
vnese znak 'x'. Po koncu vnosa naj program izpiše število pojavitev posameznih samoglasnikov (npr. a
= 2, e = 1, i = 0, o = 0, u = 3). */
import java.util.Scanner;

public class vaja9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        char znak;
        System.out.println("Vnesi znake: ");
        while (true) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                znak = input.charAt(j);
                if (znak == 'x') {
                    break;
                }
                switch (znak) {
                    case 'a':
                        a++;
                        break;
                    case 'e':
                        e++;
                        break;
                    case 'i':
                        i++;
                        break;
                    case 'o':
                        o++;
                        break;
                    case 'u':
                        u++;
                        break;
                }
            }
            if (input.indexOf('x') != -1) {
                break;
            }
        }
        System.out.println("a = " + a + ", e = " + e + ", i = " + i + ", o = " + o + ", u = " + u);
        sc.close();
    }
}
