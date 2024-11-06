/* Napišite program Naloga2, ki za podano celo število n izračuna in izpiše:
a) Vsoto števk (npr. vsota števk števila 144 je 9).
b) Število števk (npr. število 144 ima 3 števke).
c) Največjo števko.
d) Števko, ki največkrat nastopa v številu.
Upoštevajte dejstvo, da je lahko podano tudi negativno število in da ima vsako prebrano število vsaj
eno števko. Pri številu lahko zanemarite le vodilne ničle, ki ne vplivajo na vrednost števila. Npr.
število števk števila 0017 je 2. */

public class vaja2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // a) Vsota števk
        int sumOfDigits = 0;
        int nCopy = n;
        while (nCopy != 0) {
            sumOfDigits += nCopy % 10;
            nCopy /= 10;
        }

        // b) Število števk
        int numberOfDigits = 0;
        nCopy = n;
        while (nCopy != 0) {
            numberOfDigits++;
            nCopy /= 10;
        }

        // c) Največja števka
        int maxDigit = 0;
        nCopy = n;
        while (nCopy != 0) {
            int digit = nCopy % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            nCopy /= 10;
        }

        // d) Števka, ki največkrat nastopa
        int[] digitCount = new int[10];
        nCopy = n;
        while (nCopy != 0) {
            int digit = nCopy % 10;
            digitCount[digit]++;
            nCopy /= 10;
        }
        int mostFrequentDigit = 0;
        int mostFrequentDigitCount = 0;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > mostFrequentDigitCount) {
                mostFrequentDigit = i;
                mostFrequentDigitCount = digitCount[i];
            }
        }

        System.out.println("Vsota števk: " + sumOfDigits);
        System.out.println("Število števk: " + numberOfDigits);
        System.out.println("Največja števka: " + maxDigit);
        System.out.println("Števka, ki največkrat nastopa: " + mostFrequentDigit);
    }
}
