/* Izdelaj program, ki bo deloval kot pripomoček za učenje poštevanke v 3. razredu osnovne šole. Program
sprašuje po zmnožku naključnih dveh števil med 1 in 10, npr. 'Koliko je 2 x 7?' Če uporabnik vnese
pravilen odgovor, program izpiše 'Pravilno!', sicer pa 'Nepravilno!'. Program postavi 10 takih vprašanj,
na koncu pa izpiše, koliko pravilnih odgovorov je podal uporabnik (npr. 'Pravilno si odgovoril na 8 od
10 vprašanj!'). */
import java.util.Scanner;

public class vaja8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct = 0;

        for (int count = 10; count > 0; count--) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            int result = a * b;

            System.out.println("Koliko je " + a + " x " + b + "?");
            int answer = sc.nextInt();

            if (answer == result) {
                System.out.println("Pravilno!");
                correct++;
            } else {
                System.out.println("Nepravilno!");
            }
        }
        sc.close();

        System.out.println("Pravilno si odgovoril na " + correct + " od 10 vprašanj!");
    }
}
