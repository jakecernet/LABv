/*  
    Definirajte razred Pravokotnik, znotraj njega realizirajte razredne metode, ki izračunajo in vrnejo ustrezne vrednosti.
    Za vsako izmed aktivnosti implementirajte po 2 metodi; prva naj kot argument dobi dolžini stranic pravokotnika, druga 2 ravninski točki.
    Da bo lažje kontroliranje, naj bodo vse vnesene vrednosti celoštevilske.
    - ploščina
    - obseg
    - diagonala
*/

public class vaja2 {
    public static void main(String[] args) {
        System.out.println(Pravokotnik.ploscina(2, 2));
        System.out.println(Pravokotnik.ploscina(0, 0, 2, 2));
        System.out.println(Pravokotnik.obseg(3, 4));
        System.out.println(Pravokotnik.obseg(3, 4, 5, 6));
        System.out.println(Pravokotnik.diagonala(3, 4));
        System.out.println(Pravokotnik.diagonala(3, 4, 5, 6));
    }

    public static class Pravokotnik {
        public static int ploscina(int a, int b) {
            return a * b;
        }

        public static int ploscina(int x1, int y1, int x2, int y2) {
            return Math.abs(x1 - x2) * Math.abs(y1 - y2);
        }

        public static int obseg(int a, int b) {
            return 2 * a + 2 * b;
        }

        public static int obseg(int x1, int y1, int x2, int y2) {
            return 2 * Math.abs(x1 - x2) + 2 * Math.abs(y1 - y2);
        }

        public static double diagonala(int a, int b) {
            return Math.sqrt(a * a + b * b);
        }

        public static double diagonala(int x1, int y1, int x2, int y2) {
            return Math.sqrt((Math.abs(x1 - x2) * Math.abs(x1 - x2)) + (Math.abs(y1 - y2) * Math.abs(y1 - y2)));
        }
    }
}
