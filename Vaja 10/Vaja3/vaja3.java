/* 
    V dopolnjeni razred iz naloge 2 dopišite še eno metodo podčrtaj/1 kot
    public static void podčrtaj(int koliko) { }

    Izvedba metode s klicem podčrtaj(15) naj izpiše podčrtavanje z znaki '-', število izpisanih znakov
    pa naj bo enako vrednosti podanega argumenta (15).

    Napišite telo metode, ki bo ustrezalo danim zahtevam.
*/

public class vaja3 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        podcrtaj(15); // klic metode podcrtaj()
        podcrtaj('o'); // klic metode podcrtaj()
        podcrtaj(); // klic metode podcrtaj()
        izpišiRobove(); // klic metode izpišiRobove()
        podcrtaj(); // klic metode podcrtaj()
        podcrtaj('o'); // klic metode podcrtaj()
        podcrtaj(15); // klic metode podcrtaj()
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

    public static void izpišiRobove() {
        int I = 10;
        while (I > 0) {
            System.out.printf("|%58c|\n", ' ');
            I--;
        }
    }
}
