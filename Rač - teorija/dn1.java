/*  
    Dn: dodaj prejsni funkciji dodaj funkcijo, ki izpisejo vse veckratnike prebranega stevila med 1 in 10, 
    izpise elemente pod gl diagonalo po 1. vrstici, izpise vse na neglavni diagonali

    izpiše tako:
        int int int int
        *   int int int
        *    *  int int
        *    *   *  int
*/

import java.util.Scanner;

public class dn1 {
    public static void main(String[] args) {
        int tab[][] = new int[4][4];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() * 450 - 99);
            }
        }

        izpisiCelo(tab);
        System.out.println();

        izpisiGlDiagonalo(tab);
        System.out.println();

        izpisiNeglavnoDiagonalo(tab);
        System.out.println();

        izpisiLiha(tab);
        System.out.println();

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi stevilo: ");
        int stevilo = 0;
        for (int i = 0; !(i < 10 && i > 0); i++) {
            stevilo = sc.nextInt();
            i = stevilo;
        }

        izpisiVeckratnike(tab, stevilo);
        sc.close();

        System.out.println();
        izpisiTrikotnikPodDiagonalo(tab);
    }

    public static void izpisiCelo(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.printf("%5d", tab[i][j]);
            }
            System.out.println();
        }
    }

    public static void izpisiGlDiagonalo(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("%5d", tab[i][i]);
        }
        System.out.println();
    }

    public static void izpisiNeglavnoDiagonalo(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.printf("%5d", tab[i][tab.length - i - 1]);
        }
        System.out.println();
    }

    public static void izpisiLiha(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] % 2 != 0) {
                    System.out.printf("%5d", tab[i][j]);
                }
            }
        }
    }

    public static void izpisiVeckratnike(int[][] tab, int stevilo) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] % stevilo == 0) {
                    System.out.printf("%5d", tab[i][j]);
                }
            }
        }
        System.out.println();
    }

    public static void izpisiTrikotnikPodDiagonalo(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i > j) {
                    System.out.printf("%5d", tab[i][j]);
                } else {
                    System.out.printf("%5s", "*");
                }
            }
            System.out.println();
        }
    }
}