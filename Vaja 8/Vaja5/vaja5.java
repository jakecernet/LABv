/* Napišite program, s katerim zapolnite zaslonsko sliko s poljubnim znakom. Sredi zaslonske slike naj
bo prazen prostor, ki predstavlja romb višine n. Program naj se kliče kot :
Naloga5 znak visina, oziroma za spodnji primer: java Naloga5 c 5
Pri ustvarjanju zgornje slike je bilo uporabljeno:
višina = 5 + 2 = 7,
širina = (5+2) * 3 = 21,
romb je usrediščen v polju velikosti 21x7.
*/

public class vaja5 {
    public static void main(String[] args) {
        char znak = args[0].charAt(0);
        int visina = Integer.parseInt(args[1]);
        int sirina = (visina + 2) * 2; 
        int polovica = visina / 2;
        int prostor = visina + 2;
        int i, j;

        for (j = 0; j < sirina; j++) {
            System.out.print(znak);
        }
        System.out.println();

        for (i = 0; i < visina; i++) {
            for (j = 0; j < sirina; j++) {
            if (j >= prostor && j <= sirina - prostor) {
                System.out.print(" ");
            } else {
                System.out.print(znak);
            }
            }
            if (i < polovica) {
            prostor--;
            } else {
            prostor++;
            }
            System.out.println();
        }

        for (j = 0; j < sirina; j++) {
            System.out.print(znak);
        }
        System.out.println();
    }
}
