/*  
    Dana je metoda pop/1 za jemanje vrednosti s sklada, ki je realiziran kot razredna metoda:

static void pop(float[] x){
   if ( top >-1 ) {
      x[0] = sklad[top];
      top--;
   } else {
       System.out.println("sklad je prazen");
   } 
}

    a) kako metoda vrača vrednosti z vrha sklada ? /kako je potebno metodo klicati/
    Metoda vrača vrednosti z vrha sklada tako, da v metodi pop/1 podamo referenco na tabelo, v katero želimo shraniti vrednost z vrha sklada.
*/

public class vaja3a {
    static float[] sklad = new float[100];
    static int top = -1;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);

        float[] x = new float[1];
        pop(x);
        System.out.println(x[0]);
    }

    static void push(float x){
        if ( top < 99 ) {
            top++;
            sklad[top] = x;
        } else
            System.out.println("sklad je poln");
    }

    static void pop(float[] x){
        if ( top >-1 ) {
            x[0] = sklad[top];
            top--;
        } else
            System.out.println("sklad je prazen");
    }
}
