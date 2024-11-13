/* 
    Javanski program v podatek tipa int zgenerira naključno vrednost v obsegu 8 bitov. V spodnjih 8 bitih
    prešteje število enic in število ničel iz bitnega zapisa in izpiše 1 v primeru, da je enic več oziroma 0 v
    nasprotnem primeru. 
*/

public class vaja1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 256);
        int ones, zeroes = 0;
        ones = Integer.bitCount(random);
        zeroes = 8 - ones;
        int number = (ones > zeroes) ? 1 : 0;
        System.out.println("število:" + random);
        switch (number) {
            case 1:
                System.out.println("1");
                break;

            default:
                System.out.println("0");
                break;
        }
        System.out.println("Ones: " + ones + " Zeroes: " + zeroes);
    }
}