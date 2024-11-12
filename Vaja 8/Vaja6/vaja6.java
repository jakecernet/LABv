/* Spišite program Naloga6, ki na zaslon velikosti 80x25 znakov izriše lik, kot je prikazan spodaj.

+------------------------------------------------------------------------------+
|   +----------------------------------------------------------------------+   |
|   |   +--------------------------------------------------------------+   |   |
|   |   |   +------------------------------------------------------+   |   |   |
|   |   |   |   +----------------------------------------------+   |   |   |   |
|   |   |   |   |   +--------------------------------------+   |   |   |   |   |
|   |   |   |   |   |   +------------------------------+   |   |   |   |   |   |
|   |   |   |   |   |   +------------------------------+   |   |   |   |   |   |
|   |   |   |   |   +--------------------------------------+   |   |   |   |   |
|   |   |   |   +----------------------------------------------+   |   |   |   |
|   |   |   +------------------------------------------------------+   |   |   |
|   |   +--------------------------------------------------------------+   |   |
|   +----------------------------------------------------------------------+   |
+------------------------------------------------------------------------------+

Prikazan primer je izrisan v velikosti 80x16, vsak pravokotnik znotraj prejšnjega je dimenzij (a-8, b-2)
lahko pa se odločite tudi drugače, dokler je pravokotnik v pravokotniku in glede na večjega centriran
v njegovem središču. */

public class vaja6 {
    public static void main(String[] args) {
        int height = 16;
        int width = 80;

        char[][] screen = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                screen[i][j] = ' ';
            }
        }

        int a = width;
        int b = height;
        while (a > 0 && b > 0) {
            int top = (height - b) / 2;
            int bottom = (height + b) / 2 - 1;
            int left = (width - a) / 2;
            int right = (width + a) / 2 - 1;

            //vodoravne
            for (int j = left + 1; j < right; j++) {
                screen[top][j] = '-';
                screen[bottom][j] = '-';
            }

            // navpične
            for (int i = top + 1; i < bottom; i++) {
                screen[i][left] = '|';
                screen[i][right] = '|';
            }

            // robovi
            screen[top][left] = '+';
            screen[top][right] = '+';
            screen[bottom][left] = '+';
            screen[bottom][right] = '+';

            a -= 8;
            b -= 2;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }
}
