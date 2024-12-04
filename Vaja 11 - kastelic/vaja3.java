/*  
 * Naloga 3
 * Deklarirajte tabelo znakov.
 * Ustvarite tabelo celih števil z dvanajstimi elementi. 
 * Rezervirajte prostor za 10 celih števil v tabeli znakov.
 * Deklarirajte tabelo logičnih vrednosti.
 * Za tabelo logičnih vrednosti rezervirajte prostor v pomnilniku velikosti 15.
 * Inicializirajte tabelo logičnih vrednosti, da bodo vsi elementi imeli vrednost false, zgolj zadnji vrednost true.
 * Ustvarite tabelo necelih števil z vrednostmi 12.5, 3.33, 4.0, 12 in 31.13
*/

public class vaja3 {
    public static void main(String[] args) {
        char[] znaki; // deklaracija tabele znakov
        int[] stevila = new int[12]; // ustvari tabelo celih števil z dvanajstimi elementi
        char[] znaki2 = new char[10]; // rezervira prostor za 10 celih števil v tabeli znakov
        boolean[] logika; // deklarira tabelo logičnih vrednosti
        logika = new boolean[15]; // rezervira prostor v pomnilniku velikosti 15
        for (int j = 0; j < logika.length; j++) {
            logika[j] = false; // inicializira tabelo logičnih vrednosti, da bodo vsi elementi imeli vrednost
                               // false
        }
        logika[logika.length - 1] = true; // zadnji element dobi vrednost true
        double[] necela = { 12.5, 3.33, 4.0, 12, 31.13 }; // ustvari tabelo necelih števil
    }
}
