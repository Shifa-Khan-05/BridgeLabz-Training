import java.util.*;

public class Table2 {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

      // Take input for a number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();

      // Validate the user input number, if number is small than 6 and greater than 9 then exit and error 
      if (number <6 || number>9) {
            System.err.println("Invalid Number : Enter number between 6 and 9 ");
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