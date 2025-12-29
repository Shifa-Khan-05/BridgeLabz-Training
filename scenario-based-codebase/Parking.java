
//Parking Lot Gate System 🚗
import java.util.*;

class Parking
{
	//method for checking the parking
	 public static void isparking()
	 {
		 
		 //taking scanner object for taking input
	   Scanner scanner=new Scanner(System.in);
		 System.out.println();
		 int lot=5;
		 
		//Taking input again and again until user enter exit or lots are empty
		 while(true)
		 {
			 if(lot==0)
			 {
				 System.out.println("All lots are booked");
				 break;
			 }
			 System.out.println("If you want to park type 'yes' or if you want to exit type 'exit'");
			 String input= scanner.next();
			 if(input.equalsIgnoreCase("exit"))
			 {
				 System.out.println(" thank you ");
				 break;
			 }
			 
			 System.out.println("enter your choice");
			 System.out.println("'Park - ' for parking");
			 System.out.println("'show' - for showing the occupancy");
			 System.out.println("'exit'  - for exit");
			 
			 String string=scanner.next();
			 switch (string) {
			case "Park": lot--;
			System.out.println("Your car is parked");
			break;
			
			case "show": 
				System.out.println(" ocuupancy - " + lot);
			  break;
				
			case "exit" :
				System.out.println("Thank you for parking");
				break;
			
			default : 
				System.out.println("enter a valid input");    
		   }
		 } 
	 
	 }
	 
 public static void main(String args[])
 {
	 //call the method 
   isparking();
 }

}