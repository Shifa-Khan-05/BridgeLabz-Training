import java.util.*;
class Area
{

public static double areaOfCircle(double a)
{
double area= 3.14*a*a;
return area ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the radius");
double a=sc.nextDouble();

System.out.println(areaOfCircle(a)); 
}

}
