public class MonthDay {
    public static void main(String args[]) {
        int day = Integer.valueOf(args[0]);
        if (day > 31) {
            System.out.println("Napačna cifra ti lolek");
            return;
        }

        int calc = day % 7;
        switch (calc) {
            case 0:
                System.out.println("Nedelja");
                break;
            case 1:
                System.out.println("Ponedeljek");
                break;
            case 2:
                System.out.println("Torek");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Četrtek");
                break;
            case 5:
                System.out.println("Petek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
        }
    }
}
