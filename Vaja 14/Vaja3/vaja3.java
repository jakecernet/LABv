/*  
    Dano je zaporedje: 2,4,5,11,23,25,33,55,88,89,91,93,98,103,110,130
        a) Napišite sled izvajanja binarnega iskanja za podatek 98.
        b) Napišite sled izvajanja binarnega iskanja za podatek 22. Na vsakem koraku mora biti razvidno
           kaj iščemo, kateri je sredinski element, kateri del tabele pregledujemo, kateri del tabele se na
           vsakem koraku zavrže.
*/

public class vaja3 {
    public static void main(String[] args) {
        int[] tabela = { 2, 4, 5, 11, 23, 25, 33, 55, 88, 89, 91, 93, 98, 103, 110, 130 };
        int iskano = 98;
        int zacetek = 0;
        int konec = tabela.length - 1;
        int sredina = (zacetek + konec) / 2;
        int korak = 1;
        while (zacetek <= konec) {
            System.out.println("Korak: " + korak);
            System.out.println("Zacetek: " + zacetek);
            System.out.println("Konec: " + konec);
            System.out.println("Sredina: " + sredina);
            System.out.println("Iskano: " + iskano);
            System.out.println("del tabele, ki ga pregledujemo: " + zacetek + " - " + konec + " oz. " + tabela[zacetek]
                    + " - " + tabela[konec]);
            System.out.println();
            if (tabela[sredina] == iskano) {
                System.out.println("Najdeno na indeksu: " + sredina);
                break;
            } else if (tabela[sredina] < iskano) {
                zacetek = sredina + 1;
            } else {
                konec = sredina - 1;
            }
            sredina = (zacetek + konec) / 2;
            korak++;
        }

        System.out.println();

        iskano = 22;
        zacetek = 0;
        konec = tabela.length - 1;
        sredina = (zacetek + konec) / 2;
        korak = 1;
        while (zacetek <= konec) {
            System.out.println("Korak: " + korak);
            System.out.println("Zacetek: " + zacetek);
            System.out.println("Konec: " + konec);
            System.out.println("Sredina: " + sredina);
            System.out.println("Iskano: " + iskano);
            System.out.println("del tabele, ki ga pregledujemo: " + zacetek + " - " + konec + " oz. " + tabela[zacetek]
                    + " - " + tabela[konec]);
            System.out.println();
            if (tabela[sredina] == iskano) {
                System.out.println("Najdeno na indeksu: " + sredina);
                break;
            } else if (tabela[sredina] < iskano) {
                zacetek = sredina + 1;
            } else {
                konec = sredina - 1;
            }
            sredina = (zacetek + konec) / 2;
            korak++;
        }
    }
}
