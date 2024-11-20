/* 
    Zaporedje ukazov, ki ob pričetku izpiše 'Začetek:' in se konča z izpisom 'konec' med omenjenima
    zapisoma dejansko izpiše pravokotnik.
        a) recimo, da vmesno zaporedje iz naloge 1 nadomesti 'ukaz' :
           pravokotnik(60,'-',10,'|');
           Napišite ustrezno realizacijo. Realizacija naj uporabi ustrezno zaporedje že realiziranih metod
           (podčrtaj, izpiši_robove, podčrtaj).

        b) napišite še specializaciji v kvadrat (metodi izpisujeta kvadratni obliki):
            b1) kvadrat(10,'-','|'); //10x10
            b2) kvadrat(10,'+'); //10x10, celoten okvir iz znakov + 
*/

public class vaja6 {
    public static void main(String[] args) {
        System.out.println("Začetek:");
        pravokotnik(60, '-', 10, '|');
        kvadrat(10, '-', '|');
        kvadrat(10, '+' , '+');
        System.out.println("konec");
    }

    public static void pravokotnik(int dolzina, char znak, int visina, char rob) {
        podcrtaj(dolzina, znak);
        izpišiRobove(visina, dolzina - 2, rob);
        podcrtaj(dolzina, znak);
    }

    public static void kvadrat(int stranica, char znak, char rob) {
        podcrtaj(stranica, znak);
        izpišiRobove(stranica, stranica - 2, rob);
        podcrtaj(stranica, znak);
    }

    public static void podcrtaj(int koliko, char znak) {
        System.out.println((znak + "").repeat(koliko));
    }

    public static void izpišiRobove(int visina, int sirina, char rob) {
        while (visina > 0) {
            System.out.printf(rob + "%" + sirina + "c" + rob + "\n", ' ');
            visina--;
        }
    }
}
