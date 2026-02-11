/*  
 * Naloga 5
 * Dano je zaporedje: 5, 10, 25, 60, 145, 350, ... . 
 * Napišite program, ki v tabelo vpiše prvih 10 elementov zaporedja in nato izpiše vsebino tabele od največjega do najmanjšega elementa. 
 * V zaporedju sta prva dva elementa dana, vse ostale pa je moč izračunati s pomočjo predhodnih dveh.
*/

public class vaja5 {
    public static void main(String[] args) {
        int[] zaporedje = new int[10];
        zaporedje[0] = 5;
        zaporedje[1] = 10;
        for (int j = 2; j < zaporedje.length; j++) {
            zaporedje[j] = zaporedje[j - 1] * 2 + zaporedje[j - 2];
        }
        for (int j = 0; j < zaporedje.length; j++) {
            System.out.println(zaporedje[j]);
        }
    }
}
