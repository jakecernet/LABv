/*  
  * Naloga 8
 * Razredni metodi s klicem posredujete velikost. Ta v izvajanju v tabelo znakov posredovane velikosti vpiše naključne črke po pravilu:
 * na lihih indeksih tabele morajo biti samoglasniki,
 * na sodih indeksih tabele morajo biti soglasniki.
 * Po končanem vpisu metoda izpiše vsebino tabele.
*/

public class vaja8 {
    public static void main(String[] args) {
        izpisNakljucnihCrk(10);
    }

    public static void izpisNakljucnihCrk(int velikost) {
        char[] samoglasniki = { 'a', 'e', 'i', 'o', 'u' };
        char[] soglasniki = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'z' };
        char[] tab = new char[velikost];
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = samoglasniki[(int) (Math.random() * samoglasniki.length)];
            } else {
                tab[i] = soglasniki[(int) (Math.random() * soglasniki.length)];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
