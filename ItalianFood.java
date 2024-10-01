/*
 * Represents Italian food that can be sold at my Italian Restaurant
 */
public class ItalianFood {

  
 private String name; // The name of the dish
 private int calories; // The amount of calories in the dish
 private double price; // The price of the dish

/*
  * The default constructor for the ItalianFood class
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
  * Three accessor methods, one for each special instance variable in the pasta class
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
  * Three mutator methods, one for each instance variable 
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
  * The toString() method for the ItalianFood class
  */
    public String toString(){
    return "\n" + "Name: " + name + "\n" + "Calories: " + calories + "\n" + "Price: " + price;
  }
}
