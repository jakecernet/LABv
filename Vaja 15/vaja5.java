/*  
    Vseh 5 postopkov iz Naloga 1 izvedite na enakih naključno urejenih (»neurejenih«) zaporedjih dolžin 5,10,20,30,50,70,90,120,150,300,600,1000,2000,5000 elementov. 
    Štejte št. primerjav in zamenjav (Nalogi 2 in 3) v vsakokratnem izvajanju vsakega postopka. Tabelirajte rezultate (npr. excel) in izrišite grafa (zamnjave, primerjave). 
    Predpostavite, da so rezultati blizu povprečnih primerov izvajanja. Dokažite z izrisom grafov rezultatov 'merjenj'
*/

import java.util.Arrays;
import sortiranja.Sortiraj;

public class vaja5 {
    public static void main(String[] args) {
        int[] lengths = {5, 10, 20, 30, 50, 70, 90, 120, 150, 300, 600, 1000, 2000, 5000};
        int[] primerjave = new int[lengths.length];
        int[] zamenjave = new int[lengths.length];
        for (int i = 0; i < lengths.length; i++) {
            int[] array = generateRandomArray(lengths[i]);
            int[] array2 = Arrays.copyOf(array, array.length);
            int[] array3 = Arrays.copyOf(array, array.length);
            int[] array4 = Arrays.copyOf(array, array.length);
            int[] array5 = Arrays.copyOf(array, array.length);

            Sortiraj.navadnoVstavljanje(array);
            Sortiraj.navadnoVstavljanje(array2);

            Sortiraj.navadnoIzbiranje(array3);
            Sortiraj.navadnoIzbiranje(array4);

            Sortiraj.kmetSort(array5);
        }
        System.out.println(Arrays.toString(primerjave));
        System.out.println(Arrays.toString(zamenjave));
    }

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        return array;
    }
}
