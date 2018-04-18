import java.util.Scanner;
import java.awt.Color;
import apcslib.*;

public class SageTester{
   public static void main(String[] args){
      
      Scanner console = new Scanner(System.in);
      //System.out.println("What is the name of your pizza parlor?");
      //String name = console.nextLine();
      
    //drawPizza(name);
      
          
    //make this fileinput
      System.out.println("What is your account balance");
      double a = console.nextDouble();    
      System.out.println("How much Cheese do you have in supply?");
      int b = console.nextInt();
      System.out.println("How much Dough do you have in supply?");
      int c = console.nextInt();
      System.out.println("How much Pepperoni do you have in supply?");
      int d = console.nextInt();
      System.out.println("How many Veggies do you have in supply?");
      int e = console.nextInt();
      System.out.println("How much Pineapple do you have in supply?");
      int f = console.nextInt();
      System.out.println("How much Ham do you have in supply?");
      int g = console.nextInt();
      Sage diner = new Sage(a, b, c, d, e, f, g);
    
      System.out.println("How many Cheese pizzas do you want? $8");
      int cheese = console.nextInt();
      System.out.println("How many Pepperoni pizzas do you want? $10");
      int pepper = console.nextInt();
      System.out.println("How many Veggie pizzas do you want? $11");
      int veggie = console.nextInt();
      System.out.println("How many Hawaiian pizzas do you want? $11");
      int hw = console.nextInt();
      int total = 8*cheese+11*veggie+11*hw+10*pepper;
      System.out.println("Your total is : $" + total+" , is this okay?(1 for yes)");
      int answer=console.nextInt();
    
      if(answer==1){
         while(cheese>0){
            diner.orderCheese();
            cheese--;
         }
      
         while(pepper>0){
            diner.orderPepperoni();
            pepper--;
         }   
      
         while(veggie>0){
            diner.orderVeggie();
            veggie--;
         }
      
         while(hw>0){
            diner.orderHw();
            hw--;
         }
      
      
      
      
         System.out.println("# of Cheese ordered is "+ diner.getNumCheesePizzas());
         System.out.println("# of Pepperoni ordered is "+ diner.getNumPepperoniPizzas());
         System.out.println("# of Veggie ordered is "+ diner.getNumVeggiePizzas());
         System.out.println("# of Hawaiian ordered is "+ diner.getNumVeggiePizzas());
      
         System.out.print("\nRemaining supply of cheese in ounces is: ");
         System.out.println(diner.getCheeseSupply());
         System.out.print("Remaining supply of pepperoni in ounces is: ");
         System.out.println(diner.getPepperoniSupply());
         System.out.print("Remaining supply of veggies in ounces is: ");
         System.out.println(diner.getVeggieSupply());
         System.out.print("Remaining supply of dough in ounces is: ");
         System.out.println(diner.getDoughSupply());
         System.out.print("Remaining supply of pineapple in ounces is: ");
         System.out.println(diner.getPineappleSupply());
         System.out.print("Remaining supply of ham in ounces is: ");
         System.out.println(diner.getHamSupply());
      
         System.out.println("\nSo far "+name+" has made $" + diner.getRevenueTotal());
         System.out.println("Bank balance is now $"+ diner.getBankAccountBalance());
      }
   }

  

}
