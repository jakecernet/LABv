/* Javanski program ustvari 5 naključnih vrednosti z intervala [0, 17]. Nato izpiše najmanjšo vrednost izmed
ustvarjenih kot 'Najmanjša ustvarjena vrednost je xx' in največjo vrednost kot 'Največja ustvarjena vrednost je
yy). */

public class vaja5 {
    public static void main(String[] args) {
        int[] vrednosti = new int[5];
        int min = 17;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            vrednosti[i] = (int) (Math.random() * 18);
        }
        for (int i = 0; i < 5; i++) {
            if (vrednosti[i] < min) {
                min = vrednosti[i];
            }
            if (vrednosti[i] > max) {
                max = vrednosti[i];
            }
        }
        System.out.println("Najmanjša ustvarjena vrednost je " + min);
        System.out.println("Največja ustvarjena vrednost je " + max);
    }
}
