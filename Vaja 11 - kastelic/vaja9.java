/*  
 * Naloga 9
 * a) Narišite pomnilniško sliko naslednjega programa.
 * public class MyClass {
 *     public static void main(String[] args) {
 *         int[] t1 = {1,2,3,4};
 *         int[] t2 = t1;
 *         t2[1]=6;
 *         t2[3]=9;
 *         int i=0;
 *         System.out.print("Prva tabela: ");
 *         for (i=0;i<t1.length;i++){
 *           System.out.print(t1[i]+ " ");
 *         }
 *         System.out.println();
 *         System.out.print("Druga tabela: ");
 *         for (i=0;i<t2.length;i++){
 *           System.out.print(t2[i]+ " ");
 *         }
 *     }
 * }
 * b) Kaj izpiše ta program?
 * c) Popravite program tako, da v resnici dela z dvema objektoma t1 in t2 oz. da bo vsebina tabele t1 1,2,3,4 in vsebina tabele t2 1,6,3,9.
 * Opomba: lahko si pomagata s programom Jeliot 3 za animacijo in vizualizacijo izvjanja javanskega programa.
*/

public class vaja9 {
    public static void main(String[] args) {
        int[] t1 = { 1, 2, 3, 4 };
        int[] t2 = t1;
        t2[1] = 6;
        t2[3] = 9;
        int i = 0;
        System.out.print("Prva tabela: ");
        for (i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
        System.out.println();
        System.out.print("Druga tabela: ");
        for (i = 0; i < t2.length; i++) {
            System.out.print(t2[i] + " ");
        }
    }
}
