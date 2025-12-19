import java.util.*;

public class Table {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

      // Take input for a number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();

      // Validate the user input number, if negative state invalid and exit 
      if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
      }
	  
	  //create an array of size 10 for storing the result of table
	  int result[]=new int[10];
	  
	  //Creating the table of given number 
	  for(int i=0;i<result.length;i++)
	{
			result[i]=(i+1)*number;
			
	}	  
    for(int i=0;i<result.length;i++)
	{
			System.out.println(number + " * " + (i+1) + " = " +  result[i]);
	}	  
}
}