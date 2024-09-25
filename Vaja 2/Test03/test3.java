package Test03;

public class test3 {
    public static void main(Integer[] args) {
        int razlika = Integer.valueOf(args[0]) - Integer.valueOf(args[1]);
        System.out.println("Razlika št. " + args[0] + " in " + args[1] + " je " + razlika + ".");
    }
}