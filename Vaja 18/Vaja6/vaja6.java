/*
 * V vsakem izmed kvadrantov bi želeli zgenerirati po 100 točk, recimo, da je
 * celotna ravnina
 * v obsegu [-200, 200]. S črto(ami) bi želeli medseboj povezati tiste točke, ki
 * so v vsakem
 * posameznem kvadrantu najbolj oddaljene od koordinatnega izhodišča.
*/

public class vaja6 {
    ZeroTocka[] tocke = new ZeroTocka[400];
    ZeroTocka[] najboljOddaljene = new ZeroTocka[4];

    public vaja6() {
        // (1)
        for (int i = 0; i < tocke.length; i++) {
            tocke[i] = new ZeroTocka();
            if (i < 100) { // 1st quadrant
                tocke[i].x = Math.random() * 200.0;
                tocke[i].y = Math.random() * 200.0;
            } else if (i < 200) { // 2nd quadrant
                tocke[i].x = -Math.random() * 200.0;
                tocke[i].y = Math.random() * 200.0;
            } else if (i < 300) { // 3rd quadrant
                tocke[i].x = -Math.random() * 200.0;
                tocke[i].y = -Math.random() * 200.0;
            } else { // 4th quadrant
                tocke[i].x = Math.random() * 200.0;
                tocke[i].y = -Math.random() * 200.0;
            }
        }

        // (2)
        double[] maxOddaljenosti = new double[4];
        for (int i = 0; i < 4; i++) {
            najboljOddaljene[i] = tocke[i * 100];
            maxOddaljenosti[i] = razdalja(tocke[i * 100], new ZeroTocka(0, 0));
            for (int j = i * 100; j < (i + 1) * 100; j++) {
                double oddaljenost = razdalja(tocke[j], new ZeroTocka(0, 0));
                if (oddaljenost > maxOddaljenosti[i]) {
                    maxOddaljenosti[i] = oddaljenost;
                    najboljOddaljene[i] = tocke[j];
                }
            }
        }

        // (3)
        for (int i = 0; i < 4; i++) {
            System.out.println("Najbolj oddaljena tocka kvadranta " + (i + 1) + ": (" + najboljOddaljene[i].x + ", "
                    + najboljOddaljene[i].y + ")");
            System.out.println("Oddaljenost: " + maxOddaljenosti[i]);
        }

        // Visualize the points on a grid
        char[][] canvas = new char[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                canvas[i][j] = ' ';
            }
        }

        // Plot all points as '.'
        for (ZeroTocka tocka : tocke) {
            int x = (int) ((tocka.x + 250) / 10);
            int y = (int) ((tocka.y + 250) / 10);
            if (x >= 0 && x < 50 && y >= 0 && y < 50) {
                canvas[y][x] = '.';
            }
        }

        // Plot the most distant points as 'O'
        for (ZeroTocka tocka : najboljOddaljene) {
            int x = (int) ((tocka.x + 250) / 10);
            int y = (int) ((tocka.y + 250) / 10);
            if (x >= 0 && x < 50 && y >= 0 && y < 50) {
                canvas[y][x] = 'O';
            }
        }

        // Print the canvas with a big cross at the center using '|' and '-'
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if (i == 25) {
                    System.out.print('-');
                } else if (j == 25) {
                    System.out.print('|');
                } else {
                    System.out.print(canvas[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static double razdalja(ZeroTocka a, ZeroTocka b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public static void main(String[] args) {
        new vaja6();
    }

    class ZeroTocka {
        double x, y;

        ZeroTocka() {
        }

        ZeroTocka(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
