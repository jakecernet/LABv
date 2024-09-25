package Test03;

public class test1 {
    public static void main(Integer[] args) {
        int sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
        System.out.println("Vsota št. " + args[0] + " in " + args[1] + " je " + sum + ".");
    }
}