
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
 * h) 'rezultate' metod iz c), f), g) bi želeli vizualizirati, grafično. Izberite eno izmed omenjenih in
      izvedite vizualizacijo (uporabite enega od načinov : besedilna grafika, Lantena, JavaFx)
      Recimo : izbrana naloga c), JavaFX
               s črtami izrišemo koodinatne osi,središče naj bo nekje proti sredini
               izrišemo vse točke iz tabele v beli barvi, uporabimo krožnice za predstavitev točk,
               točka, ki je najbolj oddaljena, naj bo izrisana v rdeči barvi
       (to je zgolj ideja, dejansko je vizualizacija prepuščena vam samim)
 */

public class vaja1h {
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
        
        int width = 100;
        int height = 50;
        char[][] canvas = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas[i][j] = ' ';
            }
        }

        for (int i = 0; i < height; i++) {
            canvas[i][width / 2] = '|';
        }
        for (int j = 0; j < width; j++) {
            canvas[height / 2][j] = '-';
        }
        canvas[height / 2][width / 2] = '+';

        for (int i = 0; i < x.length; i++) {
            int canvasX = width / 2 + x[i];
            int canvasY = height / 2 - y[i];
            if (canvasX >= 0 && canvasX < width && canvasY >= 0 && canvasY < height) {
                canvas[canvasY][canvasX] = 'o';
            }
        }

        int maxDistanceIndex = 0;
        double maxDistance = 0;
        for (int i = 0; i < x.length; i++) {
            double distance = Math.sqrt(x[i] * x[i] + y[i] * y[i]);
            if (distance > maxDistance) {
                maxDistance = distance;
                maxDistanceIndex = i;
            }
        }
        int maxCanvasX = width / 2 + x[maxDistanceIndex];
        int maxCanvasY = height / 2 - y[maxDistanceIndex];
        if (maxCanvasX >= 0 && maxCanvasX < width && maxCanvasY >= 0 && maxCanvasY < height) {
            canvas[maxCanvasY][maxCanvasX] = 'X';
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(canvas[i][j]);
            }
            System.out.println();
        }

        System.out.println("Najbolj oddaljene točke v vsakem kvadrantu:");
        izpisiNajboljOddaljene(x, y, barva);

        System.out.println("Dolžina poti: " + vrniDolzinoPoti(x, y, barva));

        for (int i = 1; i <= 4; i++) {
            int index = najdaljVKvadrantu(x, y, barva, i);
            System.out.println("Najbolj oddaljena točka v " + i + ". kvadrantu: (" + x[index] + ", " + y[index] + ") " + barva[index]);
        }
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

    public static int vrniDolzinoPoti(int[] x, int[] y, char[] barva) {
        int dolzina = 0;
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
        int najdaljsa = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.sqrt(x[i] * x[i] + y[i] * y[i]) > najdaljsa) {
                najdaljsa = (int) Math.sqrt(x[i] * x[i] + y[i] * y[i]);
            }
        }
        dolzina += najdaljsa;
        return dolzina;
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
            System.out.println(
                    (i + 1) + " kvadrant - (" + najdaljsaX[i] + ", " + najdaljsaY[i] + ")   " + najdaljsaBarva[i]);
        }
    }

    public static int najdaljVKvadrantu(int[] x, int[] y, char[] barva, int kvadrant) {
        int najdaljsa = 0;
        double najdaljsaRazdalja = 0;
        for (int i = 0; i < x.length; i++) {
            if (kvadrant(x, y, barva, i) == kvadrant) {
                double razdalja = Math.sqrt(x[i] * x[i] + y[i] * y[i]);
                if (razdalja > najdaljsaRazdalja) {
                    najdaljsa = i;
                    najdaljsaRazdalja = razdalja;
                }
            }
        }
        return najdaljsa;
    }
}
