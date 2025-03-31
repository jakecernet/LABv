
/* 
Naredite še specializacijo Lik v Trikotnik. Ta je opredeljen s koordinatami svojih oglišč. Eno izmed oglišč
je tudi vedno prijemališče tega lika. Ustrezno opredelite potrebne konstruktorje in pazite, da se bo trkotnik
ob premiku tudi ustrezno premaknil. Vsa ostala funkcionalnost naj bo enakovredna tisti pri Krogec, ključno z
izračunom ploščine in obsega.
*/
import java.util.ArrayList;
import java.util.Random;

public class vaja7 {
   static class Lik {
      private int x;
      private int y;
      private Smer smer;

      private static class Smer {
         private String smer;

         public Smer(String smer) {
            this.smer = smer;
         }

         public String getSmer() {
            return smer;
         }

         public void obrniDesno() {
            switch (smer) {
               case "gor":
                  smer = "desno";
                  break;
               case "desno":
                  smer = "dol";
                  break;
               case "dol":
                  smer = "levo";
                  break;
               case "levo":
                  smer = "gor";
                  break;
            }
         }

         public void obrniLevo() {
            switch (smer) {
               case "gor":
                  smer = "levo";
                  break;
               case "levo":
                  smer = "dol";
                  break;
               case "dol":
                  smer = "desno";
                  break;
               case "desno":
                  smer = "gor";
                  break;
            }
         }
      }

      public Lik(int x, int y, String smer) {
         this.x = x;
         this.y = y;
         this.smer = new Smer(smer);
      }

      public Lik(int x, int y) {
         this(x, y, "gor");
      }

      public Lik() {
         this(0, 0, "gor");
      }

      public void premakni() {
         switch (smer.getSmer()) {
            case "gor":
               y++;
               break;
            case "dol":
               y--;
               break;
            case "levo":
               x--;
               break;
            case "desno":
               x++;
               break;
         }
      }

      public void obrniLevo() {
         smer.obrniLevo();
      }

      public void obrniDesno() {
         smer.obrniDesno();
      }

      public int getX() {
         return x;
      }

      public int getY() {
         return y;
      }
   }

   public static void main(String[] args) {
      Random rand = new Random();
      ArrayList<Lik> liki = new ArrayList<>();

      // Ustvari prvi lik z naključno pozicijo in smerjo
      int x = rand.nextInt(101) - 50;
      int y = rand.nextInt(101) - 50;
      String[] smeri = { "gor", "dol", "levo", "desno" };
      String smer = smeri[rand.nextInt(smeri.length)];
      liki.add(new Lik(x, y, smer));

      // Ustvari preostalih 14 likov
      for (int i = 1; i < 15; i++) {
         Lik prejsnji = liki.get(i - 1);
         Lik novLik = new Lik(prejsnji.getX(), prejsnji.getY(), prejsnji.smer.getSmer());
         novLik.premakni();
         liki.add(novLik);
      }

      // Vizualizacija pozicij
      System.out.println("Pozicije likov:");
      for (Lik lik : liki) {
         System.out.println("(" + lik.getX() + ", " + lik.getY() + ")");
      }

      // Gibanje likov za 10 premikov
      for (int i = 0; i < 10; i++) {
         liki.remove(0);
         Lik zadnji = liki.get(liki.size() - 1);
         Lik novLik = new Lik(zadnji.getX(), zadnji.getY(), zadnji.smer.getSmer());
         novLik.premakni();
         liki.add(novLik);
      }

      // Obrni desno in naredi še 10 korakov
      Lik zadnji = liki.get(liki.size() - 1);
      zadnji.obrniDesno();
      for (int i = 0; i < 10; i++) {
         liki.remove(0);
         Lik novLik = new Lik(zadnji.getX(), zadnji.getY(), zadnji.smer.getSmer());
         novLik.premakni();
         liki.add(novLik);
      }

      // Končne pozicije
      System.out.println("Končne pozicije likov:");
      for (Lik lik : liki) {
         System.out.println("(" + lik.getX() + ", " + lik.getY() + ")");
      }
   }
}
