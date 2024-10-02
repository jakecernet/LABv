/* Napišite program,ki ustvari 50 naključnih števil z intervala[5..30]in izpiše,kolikokrat se je pojavil večkratnik prebranega celega števila n.
Število n naj bo argument pri zagonu programa.Postopek je podan opisno s psevdokodo:

    preberi n inicializiraj števec(nastavi začetno vrednost števca)večkratnikov(inicializiraj generator naključnih števil,če je to potrebno)
    ponovi petdesetkrat:
        ustvari naključno število z intervala[5..30]
        če je dobljeno število večkratnik števila n,povečaj števec večkratnikov 
    izpiši števec večkratnikov

 */
public class vaja4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int stevec = 0;
        for (int i = 0; i < 50; i++) {
            int randomNum = (int)(Math.random() * (30 - 5) + 5);
            System.out.println("generirano število: " + randomNum);
            if (randomNum % n == 0) {
                stevec++;
            }
        }
        System.out.println(stevec);
    }
}