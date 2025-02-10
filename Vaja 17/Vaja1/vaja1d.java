
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
 * d) Razredna metoda kateriZNajdalj/0 vrne številko tistega kvadranta, v katerem leži točka, ki je 
     najdlje od koordinatnega izhodšča.
 */

public class vaja1d {
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

        System.out.println("Kvadrant, v katerem leži najdaljša točka je " + kateriZNajdalj(x, y, barva) + ".");
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

    public static int kateriZNajdalj(int[] x, int[] y, char[] barva) {
        int najdaljsa = 0;
        int kvadrant = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.sqrt(x[i] * x[i] + y[i] * y[i]) > najdaljsa) {
                najdaljsa = (int) Math.sqrt(x[i] * x[i] + y[i] * y[i]);
                kvadrant = kvadrant(x, y, barva, i);
            }
        }
        return kvadrant;
    }
}
