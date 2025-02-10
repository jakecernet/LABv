
/*
 * Točka v ravnini je podana kot (x[i],y[i],barva[i]), pri čemer sta x in y
 * ravninski koordinati, barva pa barva točke.
 * Množico javanskih točk popisujejo javanske definicije:
 * int[] x,y;
 * char[] barva;
 * 
 * napišite zaporedje ukazov, katerih rezultat je številka kvadranta, v katerem
 * se nahaja točka t.
 * /izbira točke ni opredeljena, je pa ena izmed obstoječih točk/
 * 
 * Kvadranti so okoli ravninskega izhodišča porazdeljeni v nasprotni smeri urinega kazalca:
 * 
 *      drugi | prvi
 *  --------(0,0)--------
 *     tretji | četrti
 * 
 * b) Razredna metoda kateriNajvec/0 vrne številko tistega kvadranta, v katerem leži največ točk.
 */

public class vaja1b {
    public static void main(String[] args) {
        int[] x = new int[10], y = new int[10];
        char[] barva = new char[10];

        for (int i = 0; i < 10; i++) {
            x[i] = (int) (Math.random() * 100) - 50;
            y[i] = (int) (Math.random() * 100) - 50;
            barva[i] = (char) (Math.random() * 26 + 'a');
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Točka " + i + " se nahaja na " + x[i] + ", " + y[i] + " v " + kvadrant(x, y, barva, i)
                            + ". kvadrantu ");
        }

        System.out.println("Največ točk je v " + kateriNajvec(x, y, barva) + ". kvadrantu.");
    }

    public static int kvadrant(int[] x, int[] y, char[] barva, int t) {
        if (x[t] > 0 && y[t] > 0) {
            return 1;
        } else if (x[t] < 0 && y[t] > 0) {
            return 2;
        } else if (x[t] < 0 && y[t] < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int kateriNajvec(int[] x, int[] y, char[] barva) {
        int[] kvadranti = new int[4];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0 && y[i] > 0) {
                kvadranti[0]++;
            } else if (x[i] < 0 && y[i] > 0) {
                kvadranti[1]++;
            } else if (x[i] < 0 && y[i] < 0) {
                kvadranti[2]++;
            } else {
                kvadranti[3]++;
            }
        }

        int max = 0;
        for (int i = 1; i < kvadranti.length; i++) {
            if (kvadranti[i] > kvadranti[max]) {
                max = i;
            }
        }

        return max + 1;
    }
}
