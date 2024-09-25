public class Katero {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        if (num1 > num2) {
            System.out.println("Prvo število je večje od drugega.");
        } else {
            System.out.println("Drugo število je večje od prvega.");
        }
    }
}