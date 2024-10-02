/*
 * Represents a pizza that can be sold at my Italian Restaurant
 * Pizza is a type of ItalianFood
 */
public class Pizza extends ItalianFood {

  private String size; // The size of the pizza (small, medium, or large)
  private String toppings; // The toppings on the pizza
  private int numSlices;   // The number of slices the pizza was divided into
  
/*
  * The no-argument constructor for the Pizza class to assign their default values
  */
  public Pizza(){
  this("unknown", 100, 0.50, "unknown", "nothing", 1);
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
  * A slightly modified parameterized constructor for the Pizza class without the toppings and numSlices variables
  */
  public Pizza(String name, int calories, double price, String size){
  super(name, calories, price);
  this.size = size;
  }
  /*
  * Three accessor methods, one for each special instance variable in the Pizza class to access their values
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
  * Three mutator methods, one for each instance variable in the Pizza class to alter their values
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
  * The toString() method for the Pizza class using the one in ItalianFood to print the values of an object
  */
  public String toString(){
    return super.toString() + "\n" + "Size: " + size + "\n" + "Toppings: " + toppings + "\n" + "Number Of Slices: " + numSlices;
  }
}
