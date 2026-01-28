/* Napiši program za ugibanje števil. Program naj na začetku ustvari naključno število N, ki naj bo med 1
in 100. Uporabnik naj ima nato 5 poizkusov, da to število ugane. Ob vsakem poizkusu vnese število, ki
ga program nato primerja z ustvarjenim ter uporabnika obvesti, ali je uganil, vnesel preveliko ali pa
morda premajhno število. Če uporabnik v petih poizkusih ne uspe uganiti števila, program izpiše
'Izgubil si! Iskano število je N', pri čemer izpiše dejansko število. Če uporabnik pri katerem izmed
poizkusov ugane vrednost iskanega števila, program izpiše 'Zmagal si! Uganil si v M poizkusih.', pri
čemer izpiše dejansko število poizkusov. */
import java.util.Scanner;

public class vaja7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = (int) (Math.random() * 100) + 1;
        int poizkusi = 5;
        int poizkus = 0;
        boolean uganil = false;

        System.out.println("Ustvarjeno naključno število med 1 in 100. Ugani ga v 5 poizkusih.");
        System.out.println("Vnesi število: ");
        while (poizkusi > 0) {
            poizkus = sc.nextInt();
            if (poizkus == N) {
                uganil = true;
                break;
            } else if (poizkus < N) {
                System.out.println("Vneseno število je premajhno.");
            } else {
                System.out.println("Vneseno število je preveliko.");
            }
            poizkusi--;
            System.out.println("Število poizkusov: " + poizkusi);
            System.out.println("Vnesi število: ");
        }

        if (uganil) {
            System.out.println("Zmagal si! Uganil si v " + (5 - poizkusi) + " poizkusih.");
        } else {
            System.out.println("Izgubil si! Iskano število je " + N + ".");
        }

        sc.close();
    }
}
