/* 
    Napišite program, ki podano desetiško vrednost izpiše v obliki dvojiškega števila. Dodajte še izpis v
    osmiški in šestnajstiški obliki: to dvoje dosežete z oblikovanjem načina izpisa.
    (npr.: System.out.printf(" %d %o %x ",18,18,18);)
*/

public class vaja4 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.print(Integer.toBinaryString(number) + " ");
        System.out.printf("%d %o %x", number, number, number);
    }
}
