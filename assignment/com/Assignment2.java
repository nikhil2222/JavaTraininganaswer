// Assignment: 1. Try using Ternary Operators and implement the Promo Code Use Case wherever possible
		//			   2. Implement Conditional Constructs on the booking of a cab in ola/uber (as per your will)

//Conditions for Cab drive :
//      Promocode: LONGROUTE if route is more than 15km give 20% discount (101)
//      Promocode : SHORTLONG if route more than 10km but less tha 15km give 25% discount(102)
package assignment.com;
import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner Scanner = new Scanner(System.in);
      System.out.println("Enter the distance between two location");
      int distance = Scanner.nextInt();
      
     System.out.println("Enter 101 for Promocode LONGROUTE and 102 for promocode SHORTLONG");
     
     int promocode = Scanner.nextInt();
     Scanner.close();
     
     System.out.println("You entered total distance to be covered : "+ distance + " and promocode is : "+promocode + "at the rate of 25 per km");
     
    int amount = 25*distance;
    System.out.println("Calculating........");
    boolean totalPaylableAmount ;
    
    
     
     
     }

}
