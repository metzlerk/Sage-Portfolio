 

class Item{
   // instance variables
   private int inventory; //# of cheese pizzas
   private String name;
   private double price;

   // constructor
   Item(){
      name = "";
      price = 0;
      inventory = 0;
   }
   
   Item(String nm){
      name = nm;
      price = 0;
      inventory = 0;
   }
    
   Item(String nm, double pr, int number){
      name = nm;
      price = pr;
      inventory = number;
   }
   
   public double getPrice(){
      return price;
   }
   
   public void setPrice(double pr){
      price = pr;
   }
   
   public int getInventory(){
      return inventory;
   }
   
   public void setInventory(int n){
      inventory = n;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String s){
      name = s;
   }
   
   public void order(){
      inventory--;
   }
      
   public String toString(){
      String str = "Name: "  + name     + "\n" +
                   "Price: " + price    + "\n" +
                   "Stock: " + inventory;
      return str;
   }
      
   
}