public class jaka7 {
    public static void main(String[] args) {
        int dolzina1 = (int) (Math.random() * 30);
        int dolzina2 = (int) (Math.random() * 30);
        int dolzina3 = (int) (Math.random() * 30);

        boolean rezultat = (dolzina1 > dolzina2);

        System.out.println("ali je dolzina1 vecja od dolzina2: " + rezultat);
    }
}
