/* 
Javanski program v podatek javanskega tipa int zgenerira naključno vrednost v obsegu 8 bitov. Teh 8
bitov predstavlja dva polbita (angl. nibble), z 1 označimo polbit z večjo težo, z 0 polbit z manjšo.
Program odgovori na vprašanje, vrednost katerega polbita je večja. Spišite ga. 
*/

public class vaja2 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 256);
        int first_nibble = random >> 4;
        int second_nibble = random & 0x0F;
        System.out.println("število:" + random);
        System.out.println((first_nibble > second_nibble) ? "prvi polbit je večji" : "drugi polbit je večji");
        System.out.println("prvi: " + first_nibble + " oz. " + Integer.toBinaryString(first_nibble) + "; drugi: "
                + second_nibble + " oz. " + Integer.toBinaryString(second_nibble));
    }
}
