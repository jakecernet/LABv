/*  
    Izvedite in preskusite delovanje naslednjih postopkov :
a)	razvrščanje z vstavljanjem
b)	razvrščanje z izbiranjem
c)	razvrščanje z mehurčki
a.	kjer  ne upoštevate meje že razvrščenega dela zaporedja
b.	kjer upoštevate mejo in razvrščate le po neurejenem delu
c.	kje ustavite razvrščanje, ko je zaporedje urejeno

* kot rezultat bi želeli 5 dokazano delujočih metod razvrščanj
*/

import sortiranja.Sortiraj;

public class vaja1 {
    public static void main(String[] args) {
        int[] tabela = { 5, 3, 1, 2, 4 };
        Sortiraj.navadnoIzbiranje(tabela);
        Sortiraj.navadnoVstavljanje(tabela);
        Sortiraj.kmetSort(tabela);
        Sortiraj.bubble_1(tabela);
        Sortiraj.bubble_2(tabela);
        Sortiraj.bubbleSort(tabela);
    }
}
