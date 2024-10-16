/* Napiši program, ki prebere tri števila ter izpiše njihovo vsoto, zmnožek, povprečno vrednost, najmanjše
in največje število. */

public class vaja5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int vsota = a + b + c;
        int zmnozek = a * b * c;
        double povprecje = (a + b + c) / 3.0;
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        System.out.println("Vsota: " + vsota);
        System.out.println("Zmnožek: " + zmnozek);
        System.out.println("Povprečje: " + povprecje);
        System.out.println("Najmanjše število: " + min);
        System.out.println("Največje število: " + max);
    }
}
