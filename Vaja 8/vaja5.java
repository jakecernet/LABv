/* Napišite program, s katerim zapolnite zaslonsko sliko s poljubnim znakom. Sredi zaslonske slike naj
bo prazen prostor, ki predstavlja romb višine n. Program naj se kliče kot :
Naloga5 znak višina, oziroma za spodnji primer: java Naloga5 c 5
Pri ustvarjanju zgornje slike je bilo uporabljeno:
višina = 5 + 2 = 7,
širina = (5+2) * 3 = 21,
romb je usrediščen v polju velikosti 21x7.
*/

public class vaja5 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uporaba: java vaja5 znak višina");
            return;
        }
        char znak = args[0].charAt(0);
        int height = Integer.parseInt(args[1]) + 2;
        int sirina = 21;
        int polovica = height / 2;
        int prostor = sirina / 2;
        int i, j;

        for (j = 0; j < sirina; j++) {
            System.out.print(znak);
        }
        System.out.println();

        for (i = 0; i < height; i++) {
            int offset = i <= polovica ? i : height - i - 1;
            for (j = 0; j < sirina; j++) {
                if (j >= prostor - offset && j <= prostor + offset) {
                    System.out.print(" ");
                } else {
                    System.out.print(znak);
                }
            }
            System.out.println();
        }

        for (j = 0; j < sirina; j++) {
            System.out.print(znak);
        }
        System.out.println();
    }
}
