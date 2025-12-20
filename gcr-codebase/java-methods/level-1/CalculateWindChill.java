import java.util.*;
//create a class named as CalculateWindChill
public class CalculateWindChill
{
   //create a method to calculate Smallest and Largets among three numbers
   public double calculateWindChill(double temperature, double windSpeed)
   {
      //taking a variable to store remainder number
      double windChill = 35.74 + 0.6215 * temperature 
              + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
      return windChill;
   }

   //main method for calling the other methods
   public static void main(String args[])
   {
      // create a scanner object 	
      Scanner sc = new Scanner(System.in);
	
      //taking user input for temperature
      System.out.println("Enter the temperature");
      double temperature = sc.nextDouble();
	
      //taking user input for windSpeed
      System.out.println("Enter the windSpeed");
      double windSpeed = sc.nextDouble();
	
      // create an object of calculateWindChill class
      CalculateWindChill c = new CalculateWindChill();
      System.out.println(c.calculateWindChill(temperature, windSpeed));
   }
}
