import java.util.*;
import javax.swing.JFrame;
import java.awt.*;

class Sage{
   private static Scanner console = new Scanner(System.in);
   private static ArrayList <Customer> patrons = new <Customer> ArrayList();
   private static ArrayList <Item> items = new <Item> ArrayList();
   
   public static void main(String[] args){
      menu();
   }
   
   public static void menu(){
      System.out.println("What do you want to do?");
      String str = 
         "1 - NEW CUSTOMER \n" +
         "2 - NEW ITEM \n"     +
         "3 - ORDER ITEM \n"   +
         "4 - EXIT PROGRAM \n" ;
      System.out.println(str);
      int input = Integer.parseInt(console.nextLine());
      switch(input){
         case 1:
            newCustomer();
            menu();
         
         case 2:
            newItem();
            menu();
         
         case 3:
            order();
            menu();
         
         case 4:
            System.exit(0);
         
         default:
            menu();
      }
      
   }
   
   public static void newCustomer(){
      System.out.println("What is your name?");
      String str = console.nextLine();
      System.out.print("How much money do you have?");
      double w = Double.parseDouble(console.nextLine());
      patrons.add(new Customer(str, w));
   }
   
   public static void newItem(){
      System.out.println("What item?");
      String str = console.nextLine();
      System.out.println("What is the price?");
      double pr = Double.parseDouble(console.nextLine());
      System.out.print("What is the inventory?");
      int i = Integer.parseInt(console.nextLine());
      items.add(new Item(str, pr, i));
   }
   
   public static void order(){
   }
}

//-------------------- End of PizzaParlor class --------------------//








