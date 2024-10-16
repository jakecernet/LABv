/* Oddelek, v katerem je n dijakov, piše kontrolno nalogo pri računalništvu. Vsak dijak lahko dobi med 0
in 20 točk. Sestavi program, ki bo omogočal vnos rezultatov n dijakov z inputom. Program ne sme dovoliti vnosa
števila točk zunaj intervala [0, 20]. Program naj izračuna in izpiše, koliko je bilo nezadostnih, zadostnih,
dobrih, prav dobrih in odličnih ocen, poleg tega pa še najnižje in najvišje število doseženih točk ter
povprečno oceno. Meje za dosego posameznih ocen so:
pod 10 točk nezadostno,
od 10 do 12 točk zadostno,
od 13 do 15 točk dobro,
od 15,5 do 17,5 točke prav dobro,
18 ali več točk odlično. */
import java.util.Scanner;

public class vaja6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi število dijakov: ");
        int n = sc.nextInt();   
        
        int nezadostno = 0;
        int zadostno = 0;
        int dobro = 0;
        int pravDobro = 0;
        int odlicno = 0;

        int[] rezultati = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Vnesi rezultate dijakov: ");
            rezultati[i] = sc.nextInt();
            if (rezultati[i] < 0 || rezultati[i] > 20) {
                System.out.println("Napaka: Rezultat mora biti med 0 in 20.");
                i--;
            } else if (rezultati[i] < 10) {
                nezadostno++;
            } else if (rezultati[i] >= 10 && rezultati[i] <= 12) {
                zadostno++;
            } else if (rezultati[i] >= 13 && rezultati[i] <= 15) {
                dobro++;
            } else if (rezultati[i] >= 15.5 && rezultati[i] <= 17.5) {
                pravDobro++;
            } else {
                odlicno++;
            }
            
            System.out.println("\n--------------------");
            System.out.println("Trenutno stanje: ");
            System.out.println("Nezadostno: " + nezadostno);
            System.out.println("Zadostno: " + zadostno);
            System.out.println("Dobro: " + dobro);
            System.out.println("Prav dobro: " + pravDobro);
            System.out.println("Odlično: " + odlicno);
            System.out.println("--------------------\n");
        }

        int min = rezultati[0];
        int max = rezultati[0];
        int vsota = 0;

        for (int i = 0; i < n; i++) {
            if (rezultati[i] < min) {
                min = rezultati[i];
            }
            if (rezultati[i] > max) {
                max = rezultati[i];
            }
            vsota += rezultati[i];
        }

        double povprecje = vsota / (double) n;

        System.out.println("\n--------------------");
        System.out.println("--------------------");
        System.out.println("Rezultati: ");
        System.out.println("Nezadostno: " + nezadostno);
        System.out.println("Zadostno: " + zadostno);
        System.out.println("Dobro: " + dobro);
        System.out.println("Prav dobro: " + pravDobro);
        System.out.println("Odlično: " + odlicno);
        System.out.println("Najnižje število točk: " + min);
        System.out.println("Najvišje število točk: " + max);
        System.out.println("Povprečna ocena: " + povprecje);
        System.out.println("--------------------");
        System.out.println("--------------------");

        sc.close();
    }    
}
