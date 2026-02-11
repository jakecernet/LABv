/*  
    V razred Pravokotnik dodajte zagonsko metodo, ki naključno zgenerira 2 točki in nato zaporedno izpiše rezultate izvedbe vseh metod
    v sekvencki kot je podana v predhodni nalogi. Koordinate zgeneriranih točk naj bodo v intervalu [-10, 10].
*/

public class vaja3 {
    public static void main(String[] args) {
        int x1 = (int) (Math.random() * 21) - 10;
        int y1 = (int) (Math.random() * 21) - 10;
        int x2 = (int) (Math.random() * 21) - 10;
        int y2 = (int) (Math.random() * 21) - 10;

        int dolzina1 = Math.abs(x1 - x2);
        int dolzina2 = Math.abs(y1 - y2);

        System.out.println(Pravokotnik.ploscina(dolzina1, dolzina2));
        System.out.println(Pravokotnik.ploscina(x1, y1, x2, y2));
        System.out.println(Pravokotnik.obseg(dolzina1, dolzina2));
        System.out.println(Pravokotnik.obseg(x1, y1, x2, y2));
        System.out.println(Pravokotnik.diagonala(dolzina1, dolzina2));
        System.out.println(Pravokotnik.diagonala(x1, y1, x2, y2));
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
