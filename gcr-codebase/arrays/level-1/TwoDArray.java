import java.util.*;

public class TwoDArray {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);

      // Take input for a rows
      System.out.print("Enter  rows: ");
      int rows = sc.nextInt();
	  
	  // Take input for a column
      System.out.print("Enter column: ");
      int column = sc.nextInt();
	  

     
	  
	  //create an 2D array of 
	  int arr[][]=new int[rows][column];
	  
	  //take input from the user
	  System.out.println("enter elements");
	   for(int i=0;i<rows;i++)
	  {
		  for(int j=0;j<column;j++)
	  {
		 arr[i][j]=sc.nextInt();
		
	  }
	  }
	  
	  //create an one d array 
	  int a[]=new int[rows*column];
	  
	  //create an index variable
	  int index=0;
	  
	  
	 
	  //
	  for(int i=0;i<rows;i++)
	  {
		  for(int j=0;j<column;j++)
	  {
		 a[index]=arr[i][j];
		 index++;
	  }
	  }
	  
	  
    for(int i=0;i<a.length;i++)
	{
			System.out.print(a[i]+ " " );
	}	  
}
}