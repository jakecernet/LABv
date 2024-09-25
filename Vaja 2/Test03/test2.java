package Test03;

public class test2 {
    public static void main(Integer[] args) {
        int mult = Integer.valueOf(args[0]) * Integer.valueOf(args[1]);
        System.out.println("Produkt št. " + args[0] + " in " + args[1] + " je " + mult + ".");
    }
}