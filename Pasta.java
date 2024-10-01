/*
 * Represents a pasta dish that can be sold at my Italian Restaurant
 * Pasta is a type of ItalianFood
 */
public class Pasta extends ItalianFood {

  private String sauceType; // The type of sauce
  private String pastaType; // The shape of the pasta
  private boolean isSpicy; // Whether or not the pasta is spicy (ex. Arrabiata)
  
 /*
  * The default constructor for the Pasta class
  */
  public Pasta(){
  this("unknown", 100, 0.50, "unknown", "unknown", false);
  }
/*
  * The parameterized constructor for the Pasta class
  * The name, calories, and price instance variables from the superclass were carried over using super
  */
public Pasta(String name, int calories, double price, String sauceType, String pastaType, boolean isSpicy){
  super(name, calories, price);
  this.sauceType = sauceType;
  this.pastaType = pastaType;
  this.isSpicy = isSpicy;
  }
  
  /*
  * Three accessor methods, one for each special instance variable in the Pasta class
  */
  public String getSauceType(){
    return sauceType;
  }
  
  public String getPastaType(){
    return pastaType;
  }
  
  public boolean getIsSpicy(){
    return isSpicy;
  }
  
  /*
  * Three mutator methods, one for each special instance variable in the Pasta class
  */
  public void setSauceType(String newSauceType){
    sauceType = newSauceType;
  }
  public void setPastaType(String newPastaType){
    pastaType = newPastaType;
  }
  public void setIsSpicy(boolean newIsSpicy){
    isSpicy = newIsSpicy;
  }
/*
  * The toString() method for the Pasta class using the one in ItalianFood
  */
  public String toString(){
    return super.toString() + "\n" + "Sauce Type: " + sauceType + "\n" + "Pasta Type: " + pastaType + "\n" + "Is It Spicy? " + isSpicy;
  }
}
