  public class Main {
  public static void main(String [] args) {

   String highSchoolName = "BWL";
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   double taxRate = 0.50;
   double subTotal = 9.00;
   double totalTax = 4.50;
   double total = 13.50;
   int numOrder = (int)(Math.random() * 100 + 1);
   int numDrinks = (int)(Math.random() * 2 + 0);
   int numCandies = (int)(Math.random() * 2 + 0);
   int numHotdogs = (int)(Math.random() * 2 + 0);
   int numHamburgers = (int)(Math.random() * 2 + 0);





     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "          *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "       *");     
     System.out.println("*     Hot Dog ..........$" + hotdogPrice + "       *");    
      System.out.println("*     Hamburger ..........$" + hamburgerPrice + "       *");
     System.out.println("*                                    *");    
     System.out.println("**************************************");

   }


  }