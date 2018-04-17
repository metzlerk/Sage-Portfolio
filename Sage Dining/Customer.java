import java.util.*;
import javax.swing.JFrame;
import java.awt.*;

class Customer{
   
   ArrayList <Item> selection = new <Item> ArrayList();
   private String name;
   private double wallet;

   Customer(){
      name = "";
      wallet = 0;
      
   }
   
   Customer(String nm, double w){
      name = nm;
      wallet = w;
   }
    
   Customer(String nm, double pr, ArrayList<Item> meal){
      name = nm;
      wallet = pr;
      for(Item i: meal){
         selection.add(i);
         i.order();
      }
   }
   
   public double getWallet(){
      return wallet;
   }
   
   public void setMoney(double pr){
      wallet = pr;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String s){
      name = s;
   }
   
   public String toString(){
      String str = "Name: "  + name   + "\n" +
                   "Money: " + wallet + "\n" ;
                   
      return str; 
   }
   
   public void addItem(Item i){
      selection.add(i);
   }
   
   public void subtractPrice(double p){
      wallet-=p;
   }
      
      
   
}
