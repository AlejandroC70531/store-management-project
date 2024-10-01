/*
 * Represents a pizza that can be sold at my Italian Restaurant
 * Pizza is a type of ItalianFood
 */
public class Pizza extends ItalianFood {

  private String size; // The size of the pizza (small, medium, or large)
  private String toppings; // The toppings on the pizza
  private int numSlices;   // The number of slices the pizza was divided into
  
/*
  * The default constructor for the Pizza class
  */
  public Pizza(){
  this("unknown", 100, 0.50, "unknown", "nothing", 0);
  }
  
/*
  * The parameterized constructor for the Pizza class
  * The name, calories, and price instance variables from the superclass were carried over using super
  */
public Pizza(String name, int calories, double price, String size, String toppings, int numSlices){
  super(name, calories, price);
  this.size = size;
  this.toppings = toppings;
  this.numSlices = numSlices;
  }
  
  /*
  * Three accessor methods, one for each special instance variable in the Pizza class
  */
  public String getSize(){
    return size;
  }
  
  public String getToppings(){
    return toppings;
  }
  
  public int getNumSlices(){
    return numSlices;
  }
  
  /*
  * Three mutator methods, one for each instance variable in the Pizza class
  */
  public void setSize(String newSize){
    size = newSize;
  }
  
  public void setToppings(String newToppings){
    toppings = newToppings;
  }
  
  public void setNumSlices(int newNumSlices){
    numSlices = newNumSlices;
  }
  
  /*
  * The toString() method for the Pizza class using the one in ItalianFood
  */
  public String toString(){
    return super.toString() + "\n" + "Size: " + size + "\n" + "Toppings: " + toppings + "\n" + "Number Of Slices: " + numSlices;
  }
}
