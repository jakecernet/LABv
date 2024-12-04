/*
    Napišite razred Kvadrat z metodami, naštetimi spodaj (imena metod so dovolj zgovorna). Vse metode
    naj bodo javne (public) in razredne (static). Pri metodah s štirimi argumenti (/4) so ti argumenti
    koordinate oglišč kvadrata, sicer je dovolj dolžina stranice ali velikost obsega ali dolžina diagonale.

    getObseg/1
    getObseg/4
    getPloscina/1
    getPloscina/4
    getPloscinaIzObsega/1
    getPloscinaIzDiagonale/1

    Zagonska metoda naj kliče vseh 6 podanih metod, nato pa naj izvede metodo test/2, pri čemer
    argumenta metode predstavljata 2 dolžini stranic (npr. prva dolžina naj bo a, druga b). V metodi
    spišite testa 'kvadratnosti':
    getObseg(a) == Pravokotnik.getObseg(a,b)
    getObseg(b) == Pravokotnik.getObseg(a,b)
*/

public class vaja5 {
    public static void main(String[] args) {
        System.out.println(Kvadrat.getObseg(2));
        System.out.println(Kvadrat.getObseg(0, 0, 2, 2));
        System.out.println(Kvadrat.getPloscina(3));
        System.out.println(Kvadrat.getPloscina(0, 0, 3, 3));
        System.out.println(Kvadrat.getPloscinaIzObsega(4));
        System.out.println(Kvadrat.getPloscinaIzDiagonale(4));
        test(2, 3);
    }

    public static class Kvadrat {
        public static int getObseg(int a) {
            return 4 * a;
        }

        public static int getObseg(int x1, int y1, int x2, int y2) {
            return 2 * Math.abs(x1 - x2) + 2 * Math.abs(y1 - y2);
        }

        public static int getPloscina(int a) {
            return a * a;
        }

        public static int getPloscina(int x1, int y1, int x2, int y2) {
            return Math.abs(x1 - x2) * Math.abs(y1 - y2);
        }

        public static int getPloscinaIzObsega(int a) {
            return a * a / 4;
        }

        public static int getPloscinaIzDiagonale(int a) {
            return a * a / 2;
        }
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

    public static void test(int a, int b) {
        System.out.println(
                Kvadrat.getObseg(a) == Pravokotnik.obseg(a, b) ? "Pravokotnik je kvadrat" : "Pravokotnik ni kvadrat");
        System.out.println(
                Kvadrat.getObseg(b) == Pravokotnik.obseg(a, b) ? "Pravokotnik je kvadrat" : "Pravokotnik ni kvadrat");
    }
}
