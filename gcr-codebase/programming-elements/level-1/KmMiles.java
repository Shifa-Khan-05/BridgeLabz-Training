import java.util.*;
public class KmMiles {

public static void kmtomiles(double km)
{
double miles=km*1.6;
System.out.println("The total miles is " + miles + "mile for the given km " + km);
}
public static void main(String args[])
{

	Scanner sc= new Scanner(System.in);
	double km=sc.nextDouble();
    kmtomiles(km); 
}

}