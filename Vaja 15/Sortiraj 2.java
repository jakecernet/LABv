import java.util.*;

/* 
    Predelajte primere iz naloge 1  tako, da bodo hkrati šteli število primerjav potrebnih za razvrstitev elementov, in dobljeno vrednost ob koncu postopka vrnili.
*/

public class Sortiraj2 {
  public static int navadnoVstavljanje(int[] t) {
    int dolzina = t.length;
    int meja = 1; // neurejeno na začetku, 1. urejen
    int mesto = 0;
    int steviloPrimerjav = 0;
    while (meja < dolzina) {
      // vizualizacija koraka
      System.out.println(Arrays.toString(t));
      // v urejenem delu poiščemo mesto za vstavljanje (1, meja -1)
      for (mesto = 0; mesto < meja && t[mesto] < t[meja]; mesto++) {
        steviloPrimerjav++;
      }
      // premaknemo večje el. urejenega dela
      int temp = t[meja]; // shranimo 1. el. neurejenega dela
      for (int i = meja; i > mesto; i--) {
        int tt = t[i];
        t[i] = t[i - 1];
        t[i - 1] = tt;
      }
      // vstavimo element
      t[mesto] = temp;
      meja++;
    }
    return steviloPrimerjav;
  }

  public static int navadnoIzbiranje(int[] t) {
    int dolzina = t.length;
    int meja = 0; // neurejeno na začetku
    int minEl = 0;
    int steviloPrimerjav = 0;

    while (meja < dolzina - 1) {
      // vizualizacija koraka
      System.out.println(Arrays.toString(t));
      // iskanje minEl v intevalu od meja do dolzina-1
      minEl = meja; // naj bo prvi minimalen
      for (int i = meja + 1; i < dolzina; i++) {
        steviloPrimerjav++;
        if (t[i] < t[minEl])
          minEl = i;
      }
      // zamenjava elementov (minEl, meja)
      int temp = t[minEl];
      t[minEl] = t[meja];
      t[meja] = temp;
      // prestavimo mejo urejenosti
      meja++;
    }
    return steviloPrimerjav;
  }

  public static int kmetSort(int[] t) {
    int N = t.length;
    int steviloPrimerjav = 0;

    for (int j = 0; j < N - 1; j++) {
      for (int i = 0; i < N - 1; i++) {
        steviloPrimerjav++;
        if (t[i + 1] < t[i]) {
          int tt = t[i];
          t[i] = t[i + 1];
          t[i + 1] = tt;
        }
      }
    }
    return steviloPrimerjav;
  }

  public static int bubble_1(int[] t) {
    int N = t.length;
    int steviloPrimerjav = 0;

    for (int j = 0; j < N - 1; j++) { // gor (j++)
      // vizualizacija faze
      System.out.println(Arrays.toString(t));
      for (int i = N - 1; i > 0; i--) { // dol (i--)
        steviloPrimerjav++;
        if (t[i] < t[i - 1]) {
          int tt = t[i];
          t[i] = t[i - 1];
          t[i - 1] = tt;
        }
      }
    }
    return steviloPrimerjav;
  }

  public static int bubble_2(int[] t) {
    int N = t.length;
    int steviloPrimerjav = 0;

    for (int j = 0; j < N - 1; j++) { // gor (j++)
      // vizualizacija faze
      System.out.println(Arrays.toString(t));
      for (int i = N - 1; i > j; i--) { // dol (i--)
        steviloPrimerjav++;
        if (t[i] < t[i - 1]) {
          int tt = t[i];
          t[i] = t[i - 1];
          t[i - 1] = tt;
        }
      }
    }
    return steviloPrimerjav;
  }

  public static int bubbleSort(int[] t) {
    int N = t.length;
    boolean zamenjava = true;
    int steviloPrimerjav = 0;

    for (int j = 0; j < N - 1 && zamenjava; j++) { // gor (j++)
      // vizualizacija faze
      System.out.println(Arrays.toString(t));
      zamenjava = false;
      for (int i = N - 1; i > j; i--) { // dol (i--)
        steviloPrimerjav++;
        if (t[i] < t[i - 1]) {
          int tt = t[i];
          t[i] = t[i - 1];
          t[i - 1] = tt;
          zamenjava = true;
        }
      }
    }
    return steviloPrimerjav;
  }
}
