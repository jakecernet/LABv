public class vaja1 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        int a = Math.abs(x1 - x2);
        int b = Math.abs(y1 - y2);

        int ploscina = a * b;
        double polmer = Math.min(a, b) / 2.0;
        double ploscina_kroga = Math.PI * Math.pow(polmer, 2);
        double ploscina_trikotnika = Math.pow(polmer, 2) * Math.sqrt(3);

        System.out.println("Ploscina pravokotnika: " + ploscina);
        System.out.println("Ploscina kroga: " + ploscina_kroga);
        System.out.println("Ploscina trikotnika: " + ploscina_trikotnika);
    }
}