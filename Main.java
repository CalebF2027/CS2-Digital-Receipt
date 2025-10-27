  import java.util.Scanner;
  public class Main {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of drinks you would like: ");
    int numDrinks = input.nextInt();
    System.out.println("Enter the amount of candies you would like: ");
    int numCandies = input.nextInt();
    System.out.println("Enter the amount of hot dogs you would like: ");
    int numHotdogs = input.nextInt();
    System.out.println("Enter the amount of hamburgers you would like: ");
    int numHamburgers = input.nextInt();

   String highSchoolName = "BirchWathenLenox";
   highSchoolName = BirchWathenLenox.substring(0, 1);
   double drinkPrice = 1.50;
   double candyPrice = 1.25;
   double hotdogPrice = 2.75;
   double hamburgerPrice = 3.50;
   double taxRate = 0.50;
   double subTotal = drinkPrice * numDrinks + candyPrice * numCandies + hotdogPrice * numHotdogs + hamburgerPrice + numHamburgers;
   double totalTax = subTotal * taxRate;
   double total = totalTax + subTotal;
   
   int numOrder = (int)(Math.random() * 100 + 1);
   // int numDrinks = (int)(Math.random() * 2 + 0);
   // int numCandies = (int)(Math.random() * 2 + 0);
   // int numHotdogs = (int)(Math.random() * 2 + 0);
   // int numHamburgers = (int)(Math.random() * 2 + 0);





     // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*     Order Number:     " + numOrder + "                           *");
     System.out.println("*     Number of Drinks: " + numDrinks + "  Drink ..........$" + drinkPrice + "          *");                      
       System.out.println("*     Number of Candies: " + numCandies + "  Candies ..........$" + candyPrice + "          *");    
       System.out.println("*     Number of Hot Dogs: " + numHotdogs + "  Hot Dogs ..........$" + hotdogPrice + "          *");   
        System.out.println("*     Number of Hamburgers: " + numHamburgers + "  Hamburgers ..........$" + hamburgerPrice + "          *");  
     System.out.println("*     The total of your order will be:              " + total + "          *");    
     System.out.println("**************************************");

   }


  }