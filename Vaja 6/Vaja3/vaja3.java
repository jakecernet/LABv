/* Napiši program, ki prebere dve števili, in sicer maso osebe v kilogramih in njeno višino v centimetrih
ter na podlagi teh vhodnih podatkov izračuna ITM (indeks telesne mase) osebe.
Formula za izračun ITM je naslednja: (masa [kg]) / (višina[m])2
Na podlagi ITM naj program nato izpiše, ali ima oseba telesno težo:
- premajhno (vrednost ITM pod 18,5),
- normalno (vrednost ITM med 18,5 in 25),
- prekomerno (vrednost ITM med 25 in 30) oz.
- preveliko (vrednost ITM več kot 30).
Bodi pozoren na merske enote. */

public class vaja3 {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        double itm = (double) weight / Math.pow((double) height / 100, 2);

        if (itm < 18.5) {
            System.out.println("Oseba ima premajhno telesno težo. (ITM: " + itm + ")");
        } else if (itm >= 18.5 && itm < 25) {
            System.out.println("Oseba ima normalno telesno težo. (ITM: " + itm + ")");
        } else if (itm >= 25 && itm < 30) {
            System.out.println("Oseba ima prekomerno telesno težo. (ITM: " + itm + ")");
        } else {
            System.out.println("Oseba ima preveliko telesno težo. (ITM: " + itm + ")");
        }
    }
}
