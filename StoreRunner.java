import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

/*
 * Test cases for ItalianFood()
 */
 ItalianFood i = new ItalianFood();
 System.out.println(i.toString());
 ItalianFood t = new ItalianFood("t", 4.99);
 System.out.println(t.toString());
 ItalianFood spaghetti = new ItalianFood("Spaghetti", 1100, 21.99);
 System.out.println(spaghetti.toString());

 t.setCalories(-100);
 System.out.println(t.getCalories());
 t.setPrice(-1.00);
 System.out.println(t.getPrice());
/*
 * Test cases for Pasta()
 */
 Pasta p = new Pasta();
 System.out.println(p.toString());
 Pasta arrabiata = new Pasta("Penne alla Arrabiata", 1400, 22.99, "arrabiata", "penne", true);
 System.out.println(arrabiata.toString());
 Pasta puttanesca = new Pasta("Spaghetti alla Puttanesca", 850, 18.99, "puttanesca", "spaghetti");
 System.out.println(puttanesca.toString());

 puttanesca.setPastaType("rigatoni");
 System.out.println(puttanesca.getPastaType());
/*
 * Test cases for Pizza()
 */
 Pizza z = new Pizza();
 System.out.println(p.toString());
 Pizza margherita = new Pizza("Pizza Margherita", 1800, 29.99, "medium");
 System.out.println(margherita.toString());
 Pizza siciliana = new Pizza("Pizza Siciliana", 2260, 33.99, "large", "onions, anchovies", 10);
 System.out.println(siciliana.toString());
    
 siciliana.setNumSlices(12);
 System.out.println(siciliana.getNumSlices());
/*
 * Test cases for Gelato()
 */
  Gelato g = new Gelato();
  System.out.println(g.toString());
  Gelato pistachio = new Gelato("Pistachio Gelato", 650, 8.99, "pistachio", true);
  System.out.println(pistachio.toString());
  Gelato stracciatella = new Gelato("Stracciatella Gelato", 800, 11.99, "stracciatella");
  System.out.println(stracciatella.toString());

 pistachio.setIsInCone(false);
 System.out.println(pistachio.getIsInCone());
  }
}
