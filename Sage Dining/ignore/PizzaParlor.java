 

class PizzaParlor{
  // instance variables
  private int myNumCheesePizzas; //# of cheese pizzas
  private int myNumPeppPizzas; // # of pepperoni pizzas
  private int myNumVegPizzas; //# of veggie pizzas
  private int myNumHwPizzas;
  private int myCheeseSupply; // ounces of cheese
  private int myPepperoniSupply;// ounces of pepperoni
  private int myVeggieSupply; // ounces of veggies
  private int myDoughSupply;
  private int myPineappleSupply;
  private int myHamSupply;
  private double myRevenue; // dollars collected
  private double myOrigAcctBal;//original bank account balance

  // constructor
  PizzaParlor(){
    myNumCheesePizzas = 0;
    myNumPeppPizzas = 0;
    myNumVegPizzas = 0;
    myNumHwPizzas = 0;
    myCheeseSupply = 400;  
    myPepperoniSupply = 200;
    myVeggieSupply = 200;
    myDoughSupply = 400;
    myPineappleSupply = 200;
    myHamSupply = 200;
    myRevenue = 0; 
    myOrigAcctBal = 1000;
  }
  
  PizzaParlor(double n){
    myNumCheesePizzas = 0;
    myNumPeppPizzas = 0;
    myNumVegPizzas = 0;
    myNumHwPizzas = 0;
    myCheeseSupply = 400;  
    myPepperoniSupply = 200;
    myVeggieSupply = 200;
    myDoughSupply = 400;
    myPineappleSupply = 200;
    myHamSupply = 200;
    myRevenue = 0; 
    myOrigAcctBal = n;
   }
   
   PizzaParlor(double a, int b, int c, int d, int e, int f, int g){
    myNumCheesePizzas = 0;
    myNumPeppPizzas = 0;
    myNumVegPizzas = 0;
    myNumHwPizzas = 0;
    myCheeseSupply = b;  
    myPepperoniSupply = d;
    myVeggieSupply = e;
    myDoughSupply = c;
    myPineappleSupply = f;
    myHamSupply = g;
    myRevenue = 0; 
    myOrigAcctBal = a;
   }

   
  // methods
  void orderCheese(){
    myNumCheesePizzas++;
    myRevenue += 8;// cheese pizza price:$8
    myCheeseSupply -= 12;//cheese needed per cheese pizza
    myDoughSupply -= 11;
    
    if(myCheeseSupply <=0){
      myCheeseSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
    if(myDoughSupply<=0){
      myDoughSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }  
  }

  void orderPepperoni(){
    myNumPeppPizzas++;
    myRevenue += 10;//pepperoni pizza price:$10
    myCheeseSupply -= 8;//cheese needed per pepp pizza
    myPepperoniSupply -= 6;//pepperoni needed per pepp pizza
    myDoughSupply -= 11;
    
    if(myCheeseSupply <=0){
      myCheeseSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
    if(myDoughSupply<=0){
      myDoughSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
    if(myPepperoniSupply<=0){
      myPepperoniSupply+=200;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }     
  }

  void orderVeggie(){
    myNumVegPizzas++;
    myRevenue += 11;//veggie pizza price:$11
    myCheeseSupply -= 8;//cheese needed per veggie pizza
    myVeggieSupply -= 12;//veggies needed per veggie pizza
    myDoughSupply -= 11;
    
    if(myCheeseSupply <=0){
      myCheeseSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
    if(myDoughSupply<=0){
      myDoughSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
    if(myVeggieSupply<=0){
      myVeggieSupply+=200;
      myRevenue-=50; 
      System.out.println("Supplies are low");
      }       
  }
  
  void orderHw(){
   myNumHwPizzas++;
   myRevenue += 11;
   myCheeseSupply -= 8;
   myPineappleSupply -= 6;
   myHamSupply -= 6;
   myDoughSupply -= 11;
   
   if(myCheeseSupply <=0){
      myCheeseSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
   if(myDoughSupply<=0){
      myDoughSupply+=400;
      myRevenue-=50;
      System.out.println("Supplies are low");
      } 
   if(myPineappleSupply<=0){
      myPineappleSupply+=200;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }
   if(myHamSupply<=0){
      myHamSupply+=200;
      myRevenue-=50;
      System.out.println("Supplies are low");
      }   
   }
   
  int getNumCheesePizzas(){
    return myNumCheesePizzas;
  }

  int getNumPepperoniPizzas(){
    return myNumPeppPizzas;
  }

  int getNumVeggiePizzas(){
    return myNumVegPizzas;
  }
  
  int getNumHwPizzas(){
   return myNumHwPizzas;
   }
   
  int getCheeseSupply(){
    return myCheeseSupply;
  }

  int getPepperoniSupply(){
    return myPepperoniSupply;
  }

  int getVeggieSupply(){
    return myVeggieSupply;
  }
  
  int getPineappleSupply(){
   return myPineappleSupply;
   }
  
  int getHamSupply(){
   return myHamSupply;
   }   

  double getRevenueTotal(){
    return myRevenue;
  }

  double getBankAccountBalance(){
    return myOrigAcctBal + myRevenue;
  }
  
  int getDoughSupply(){
    return myDoughSupply;
  }
}

//-------------------- End of PizzaParlor class --------------------//








