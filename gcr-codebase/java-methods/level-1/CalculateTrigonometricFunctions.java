import java.util.*;
//create a class named as CalculateTrigonometricFunctions
 public class CalculateTrigonometricFunctions
{
   //create a method to calculate Smallest and Largets among three numbers
   public double[] calculateTrigonometricFunctions(double angle)
	{
		
		//convert the angle into radians 
		//by using math class
	   double radian= Math.toRadians(angle);
	   
	   //create array to store the value of sin,cos, tan 
	   double result[]=new double[3];
	   result[0]=Math.sin(radian);
	   result[1]=Math.cos(radian);
	   result[2]=Math.tan(radian);
	   
	   //return the whole array
	   return result;
	}


  //main method for calling the other methods
	public static void main(String args[])
	{
	 // create a scanner object 	
	Scanner sc= new Scanner(System.in);
	
	//taking user input for angle
	System.out.println("Enter the angle");
	double angle=sc.nextDouble();
	
	//create an object of CalculateTrigonometricFunctions class 
	 CalculateTrigonometricFunctions c= new CalculateTrigonometricFunctions();
	 
	 //create an array to store the output 
	double result[]=c.calculateTrigonometricFunctions(angle);
	
	//display the output
		System.out.println(" Sin " + angle +" = "+ result[0]);
        System.out.println(" Cos " + angle +" = "+result[1]);
		System.out.println(" Tan " + angle +" = "+result[2]);

   
     
	}

}
