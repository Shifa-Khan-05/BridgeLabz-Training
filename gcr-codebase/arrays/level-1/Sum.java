import java.util.*;

public class Sum {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

  //create an array of size 10 for storing the result of table
	  double a[]=new double[10];
      

  //create a variable index
   int index=0;
   
   // create a variable for total
   double total=0.0;
   
	// taking input from user by using infinite while loop 
   //also checks the logic that user 
   while(true){
	
	  double value =sc.nextDouble();
	  if(index == 10 || value<=0)
	  {
	   break;
	  }
	  a[index] = value;
         index++;
     }	 
	  
	  
	  //calculating the sum of the numbers 
	  for(int i=0;i<index;i++)
	{
			total+=a[i];	
	}	  
    
	//display the output
			System.out.println(total);
		  
}
}