// Create CheckNumber Class to check whether the numbers are positive, negative  
// or zero by using an array
import java.util.Scanner;

public class CheckNumber {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);
	  
	  // Creating an Array of length 5  
	  int array[] = new int[5];
	  
		System.out.println("Enter the Array elements or Numbers");
		
	  // For loop to take input from the user and store 
	  // them into the Array
	  for(int i=0; i<array.length; i++){
			array[i] = sc.nextInt();
		}
		
	  // For loop to iterate through the array and check if 
	  // the number is positive, negative and zero
	  for (int i=0; i<array.length; i++){
		if (array[i]>0){
			System.out.println("The number " + array[i] + " is Positive");
		}
		else if (array[i] ==0){
			System.out.println("The number " + array[i] + " is Zero");
		}
		else{
			System.out.println("The number " + array[i] + " is Negative");
		}
	  }
	  
	  // Compare first and last element 
	  if (array[0] > array[(array.length)-1] ){
			System.out.println("The First element is greater than last element");
		}
	  else if(array[0]==array[(array.length)-1]){
			System.out.println("The First element & last element are equal");
		}
		else {
			System.out.println("The Last element is greater than First element");
		}
		
		
      // Close the Scanner Object
      sc.close();
   }
}