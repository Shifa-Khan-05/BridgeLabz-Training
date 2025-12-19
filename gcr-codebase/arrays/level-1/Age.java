import java.util.*;

public class Age {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner sc = new Scanner(System.in);


     //declaring an array of size 10
     int age[]=new int[10];
	 
      // Take input for a students age by using for loop
      System.out.print("Enter the age of students: ");
      for(int i=0;i<age.length;i++){
	    age[i]=sc.nextInt();
		 // Validate the user input number, if negative state invalid and exit 
		if(age[i]<0)
		{
		  System.out.println("Invalid input");
		  break;
		}
		else if(age[i]>=18)
		{
	     System.out.println("the student with age  " + age[i] + " can vote ");

		}
		else{
		 System.out.println("the student with age  " + age[i] + " cannot vote ");

		}
		
}
}
}
     
     
