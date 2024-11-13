/* 
    Program naj ugotavlja, koliko naključnih števil je potrebno ustvariti, da z njihovo vsebino lahko
    zapolnimo vseh spodnjih 16 bitov. Recimo: število 5 pokrije bita 0 in 2, število 10 bita 3 in 1. Ti števili
    skupaj zapolnita spodnje štiri bite. Število 7 zatem bi bilo nekoristno, ker so njegove enice že
    vsebovane v številih 5 in 10. Program med izvajanjem izpiše vsa tista števila, ki 'prispevajo' svoje bite
    oz. so koristna, nekoristnih pa ne. Ob koncu izpiše še, koliko števil je bilo potrebno generirati, koliko
    od tega je bilo koristnih (ustreznih) in kolikšen je bil odstotek koristnih.Naključna števila izbirajte z
    intervala: [0-Integer.MAX_VALUE]
*/

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class vaja5_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> usefulNumbers = new HashSet<>();
        int allBits = 0;
        int totalGenerated = 0;
        Set<Integer> numbers = new HashSet<>();
        
        while (allBits != 0xFFFF) { // 0xFFFF vsi biti so 1
            int number = random.nextInt(Integer.MAX_VALUE); // Generiraj naključno število med 0 in Integer.MAX_VALUE
            totalGenerated++;
            numbers.add(number);
            int bits = number & 0xFFFF; // Maskiraj, da dobiš spodnjih 16 bitov

            if ((allBits | bits) != allBits) { // Preveri, če to število prispeva nove bite
                usefulNumbers.add(number);
                allBits |= bits; // Posodobi bite, ki smo jih videli do sedaj
            }
        }

        System.out.println("Generirana števila: " + numbers);
        System.out.println("Koristna števila: " + usefulNumbers);
        System.out.println("Skupno generiranih števil: " + totalGenerated);
        System.out.println("Število koristnih števil: " + usefulNumbers.size());
        System.out.println("Odstotek koristnih števil: " + (usefulNumbers.size() * 100.0 / totalGenerated) + "%");
    }
}
