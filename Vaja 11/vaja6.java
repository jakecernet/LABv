/*  
 * Naloga 6
 * a) Napišite program, s katerim v tabelo vpišete 20 naključnih samoglasnikov. Nato izpišite vsebino tabele, črko, ki se nahaja na začetku in črko, ki se nahaja na koncu tabele. 
 * b) Predelajte zgornji program tako, da bo velikost tabele neko naključno število iz intervala [10..20]. 
 * Nato izpišite vsebino tabele, črki, ki se nahajata na začetku tabele in črki, ki se nahajata na koncu tabele. Glej primer:
*/

public class vaja6 {
    public static void main(String[] args) {
        char[] samoglasniki = new char[20];
        char[] abeceda = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < samoglasniki.length; i++) {
            samoglasniki[i] = abeceda[(int) (Math.random() * abeceda.length)];
        }
        for (int i = 0; i < samoglasniki.length; i++) {
            System.out.print(samoglasniki[i] + " ");
        }
        System.out.println();
        System.out.println("Prva črka: " + samoglasniki[0]);
        System.out.println("Zadnja črka: " + samoglasniki[samoglasniki.length - 1]);
    }
}
