class SimKocka {
    public static void main(String[] arg) {
        int izbrana = (int) (Math.random() * 6 + 1);
        if (izbrana == 1) {
            System.out.println(" ----- ");
            System.out.println("|     |");
            System.out.println("|  *  |");
            System.out.println("|     |");
            System.out.println(" ----- ");
        }
        if (izbrana == 2) {
            System.out.println(" ----- ");
            System.out.println("|    *|");
            System.out.println("|     |");
            System.out.println("|*    |");
            System.out.println(" ----- ");
        }
        if (izbrana == 3) {
            System.out.println(" ----- ");
            System.out.println("|    *|");
            System.out.println("|  *  |");
            System.out.println("|*    |");
            System.out.println(" ----- ");
        }
        if (izbrana == 4) {
            System.out.println(" ----- ");
            System.out.println("|*   *|");
            System.out.println("|     |");
            System.out.println("|*   *|");
            System.out.println(" ----- ");
        }
        if (izbrana == 5) {
            System.out.println(" ----- ");
            System.out.println("|*   *|");
            System.out.println("|  *  |");
            System.out.println("|*   *|");
            System.out.println(" ----- ");
        }
        if (izbrana == 6) {
            System.out.println(" ----- ");
            System.out.println("| * * |");
            System.out.println("| * * |");
            System.out.println("| * * |");
            System.out.println(" ----- ");
        }
    }
}