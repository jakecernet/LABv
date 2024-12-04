/* 
 * Naloga 4
 * Dani sta tabeli: 
 * int[] it = new int[5];
 * boolean[] bt = new boolean[5];
 * 
 * Spišite sekvenco stavkov, ki bo izpisala vrednosti prvega in zadnjega elementa obeh tabel. Kakšno so te vrednosti?
*/

public class vaja4 {
    public static void main(String[] args) {
        int[] it = new int[5];
        boolean[] bt = new boolean[5];
        System.out.println("Prvi element tabele it: " + it[0]);
        System.out.println("Zadnji element tabele it: " + it[it.length - 1]);
        System.out.println("Prvi element tabele bt: " + bt[0]);
        System.out.println("Zadnji element tabele bt: " + bt[bt.length - 1]);
    }
}
