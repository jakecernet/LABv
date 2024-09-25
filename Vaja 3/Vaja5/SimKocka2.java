class SimKocka2 {
    public static void main(String[] arg) {
        int izbrana = (int) (Math.random() * 6 + 1);
        int izbrana2 = (int) (Math.random() * 6 + 1);

        if (izbrana == 1 || izbrana2 == 1) {
            System.out.println(" ----- ");
            System.out.println("|     |");
            System.out.println("|  *  |");
            System.out.println("|     |");
            System.out.println(" ----- ");
        }
        if (izbrana == 2 || izbrana2 == 2) {
            System.out.println(" ----- ");
            System.out.println("|    *|");
            System.out.println("|     |");
            System.out.println("|*    |");
            System.out.println(" ----- ");
        }
        if (izbrana == 3 || izbrana2 == 3) {
            System.out.println(" ----- ");
            System.out.println("|    *|");
            System.out.println("|  *  |");
            System.out.println("|*    |");
            System.out.println(" ----- ");
        }
        if (izbrana == 4 || izbrana2 == 4) {
            System.out.println(" ----- ");
            System.out.println("|*   *|");
            System.out.println("|     |");
            System.out.println("|*   *|");
            System.out.println(" ----- ");
        }
        if (izbrana == 5 || izbrana2 == 5) {
            System.out.println(" ----- ");
            System.out.println("|*   *|");
            System.out.println("|  *  |");
            System.out.println("|*   *|");
            System.out.println(" ----- ");
        }
        if (izbrana == 6 || izbrana2 == 6) {
            System.out.println(" ----- ");
            System.out.println("| * * |");
            System.out.println("| * * |");
            System.out.println("| * * |");
            System.out.println(" ----- ");
        }
    }
}