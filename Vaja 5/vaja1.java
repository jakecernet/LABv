/* Ocenite trenutni kot, ki ga oklepa minutni kazalec ure z vodoravno osjo. Napišite javanski program, kjer boste
deklarirali in inicializirali spremenljivko z ocenjenim kotom, nato pa izpisali vrednosti tega kota v stopinjah, v
radianih in gradih */

public class vaja1 {
    public static void main(String[] args) {
        float kot = 80;
        System.out.println("Kot v stopinjah: " + kot);
        System.out.println("Kot v radianih: " + Math.toRadians(kot));
        System.out.println("Kot v gradih: " + kot * 10 / 9);
    }
}