/*
 * Represents Gelato that can be sold at a my Italian Restaurant
 * Gelato is a type of ItalianFood
 */
public class Gelato extends ItalianFood {

  private String flavor;   // The flavor of the gelato
  private boolean isInCone; // Whether or not the gelato is in a cone
  
 /*
  * The default constructor for the Gelato class
  */
  public Gelato(){
  this("unknown", 100, 0.50, "unknown", false);
  }
  
 /*
  * The parameterized constructor for the Gelato class
  * The name, calories, and price instance variables from the superclass were carried over using super
  */
public Gelato(String name, int calories, double price, String flavor, boolean isInCone){
  super(name, calories, price);
  this.flavor = flavor;
  this.isInCone = isInCone;
  }
  
  /*
  * Two accessor methods to access special instance variables in the Gelato class
  */
  public String getFlavor(){
    return flavor;
  }
  
  public boolean getIsInCone(){
    return isInCone;
  }
  
  /*
  * Two mutator methods, one for each special instance variable in the Gelato class
  */
  public void setFlavor(String newFlavor){
    flavor = newFlavor;
  }
  
  public void setIsInCone(boolean newIsInCone){
    isInCone = newIsInCone;
  }
  
  /*
  * The toString() method for the Gelato class using the one in ItalianFood
  */
  public String toString(){
    return super.toString() + "\n" + "Flavor: " + flavor + "\n" + "Is It In A Cone? " + isInCone;
  }
}
