/* 
    Posplošite metodo IzpišiRobove() v največji možni meri in posplošitev dodajte v razred k
    ostalim metodam. 
*/

public class vaja5 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        podcrtaj(60, 'o'); // klic metode podcrtaj()
        izpišiRobove(10, 58, ' '); // klic metode izpišiRobove()
        podcrtaj(60, 'o'); // klic metode podcrtaj()
        System.out.println("konec");
    }

    public static void podcrtaj() {
        System.out.println(("" + '-').repeat(60));
    }

    public static void podcrtaj(char znak) {
        System.out.println((znak + "").repeat(60));
    }

    public static void podcrtaj(int koliko) {
        System.out.println(("" + '-').repeat(koliko));
    }

    public static void podcrtaj(int koliko, char znak) {
        System.out.println((znak + "").repeat(koliko));
    }

    public static void izpišiRobove(int height, int width, char znak) {
        while (height > 0) {
            System.out.printf("|%" + width + "c|\n", znak);
            height--;
        }
    }
}
