import java.util.*;

public class Table2 {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

      // Take input for a number
      System.out.print("Enter a number: ");
      int number = sc.nextInt();

      // Validate the user input number, if number is negative then exit and error 
      if (number<=0) {
            System.err.println("Invalid Number : ");
            System.exit(0);
      }
	  
	  //taking a max variable for size
	  int maxFactor=10;
	  
	  //create an array of size 10 for storing the result of table
	  int factors[]=new int[maxFactor];
	  
	  //take index variable
	  int index=0;
	  
	  
	  int temp[];
	  //Finding the factors by using while loop
	  for(int i=1;i<=number;i++)
	  {
	      if (number % i == 0) {

            if (index == maxFactor) {
               maxFactor = maxFactor * 2;
               temp = new int[maxFactor];

               for (int j = 0; j < index; j++)
                  temp[j] = factors[j];

               factors = temp;
            }

            factors[index] = i;
            index++;
         }
	  }
	  
	  
    for(int i=0;i<factors.length;i++)
	{
			System.out.println(factors[i]);
	}	  
}
}