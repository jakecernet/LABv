
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
 * e) Razredna metoda izpisiNajboljOddaljene/0 izpiše točke za vsakega izmed kvadrantov, ki so najbolj oddaljene
     od koordinatnega izhodišča. Izpis naj bo v obliki:
       I kvadrant - (x-koordinata,y-koordinata)   barva
      II kvadrant - (x2-koordinata,y2-koordinata) barva2
 */

public class vaja1e {
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

        izpisiNajboljOddaljene(x, y, barva);
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

    public static void izpisiNajboljOddaljene(int[] x, int[] y, char[] barva) {
        int[] najdaljsa = new int[4];
        int[] najdaljsaX = new int[4];
        int[] najdaljsaY = new int[4];
        char[] najdaljsaBarva = new char[4];
        for (int i = 0; i < x.length; i++) {
            if (Math.sqrt(x[i] * x[i] + y[i] * y[i]) > najdaljsa[kvadrant(x, y, barva, i) - 1]) {
                najdaljsa[kvadrant(x, y, barva, i) - 1] = (int) Math.sqrt(x[i] * x[i] + y[i] * y[i]);
                najdaljsaX[kvadrant(x, y, barva, i) - 1] = x[i];
                najdaljsaY[kvadrant(x, y, barva, i) - 1] = y[i];
                najdaljsaBarva[kvadrant(x, y, barva, i) - 1] = barva[i];
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + " kvadrant - (" + najdaljsaX[i] + ", " + najdaljsaY[i] + ")   " + najdaljsaBarva[i]);
        }
    }
}
