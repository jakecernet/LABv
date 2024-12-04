/* 
    Zagonska metoda razreda Test za vsako izmed 20 naključno generiranih vrednosti iz obsega velikosti
    tipa int(Integer) ugotovlja in izpiše, ali je generirano število pozitivno ter absolutno vrednost števila:

        System.out.println("Št. "+stevilo+" je pozitivno? "+(Integer.signum(stevilo)*stevilo==stevilo) +
        " njegova abs. vrednost="+Integer.signum(stevilo)*stevilo);

    Dopolnite do zahtevanega.
*/

public class vaja4 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            long stevilo = (long) (Math.random() * Integer.MAX_VALUE * 2) - Integer.MAX_VALUE;
            System.out.println("Št. " + stevilo + " je "
                    + ((Long.signum(stevilo) * stevilo == stevilo) ? "pozitivno" : "negativno")
                    + ", njegova absolutna vrednost je " + Long.signum(stevilo) * stevilo);
        }
    }
}
