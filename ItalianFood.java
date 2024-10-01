/*
 * Represents Italian food that can be sold at my Italian Restaurant
 */
public class ItalianFood {

  
 private String name; // The name of the dish
 private int calories; // The amount of calories in the dish
 private double price; // The price of the dish

/*
  * The default constructor for the ItalianFood class with the default values
  */
public ItalianFood(){
  this("unknown", 100, 0.50);
}
  
/*
  * The parameterized constructor for the ItalianFood class
  */
public ItalianFood(String name, int calories, double price){
  this.name = name;
  this.calories = calories;
  this.price = price;
}
  
/*
  * A slightly modified parameterized constructor for the ItalianFood class without the calories variable
  */
public ItalianFood(String name, double price){
  this.name = name;
  this.price = price;
}

  /*
  * Three accessor methods, one for each special instance variable in the pasta class to be able to access their values
  */
  public String getName(){
  return name;
}

  public int getCalories(){
  return calories;
}
  
  public double getPrice(){
  return price;
}
  
  /*
  * Three mutator methods, one for each instance variable to be able to alter their values
  */
  public void setName(String newName){
    name = newName;
  }
  public void setCalories(int newCalories){
    if(newCalories < 0){
    calories = 0;
    } else {
    calories = newCalories;
   }
  }
  public void setPrice(double newPrice){
    if(newPrice < 0.0){
    price = 0.50;
    } else {
    price = newPrice;
    }
   }

  /*
  * The toString() method for the ItalianFood class to print an object's values
  */
    public String toString(){
    return "\n" + "Name: " + name + "\n" + "Calories: " + calories + "\n" + "Price: " + price;
  }
}
