/* Napiši program, ki prebere dve števili, poišče največji skupni delitelj obeh števil ter slednjega izpiše. */

public class vaja4 {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Največji skupni delitelj števil " + first + " in " + second + " je: " + gcd);
    }
}
