import java.util.*;
class Conversion
{

public static double conversion(double a)
{
double Fahrenheit = (a * 9/5) + 32;
return  Fahrenheit ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter temperature in calcius");
double a=sc.nextDouble();

System.out.println(conversion(a)); 
}

}
