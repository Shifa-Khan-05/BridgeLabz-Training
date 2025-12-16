import java.util.*;
class Volume
{

public static double volume(double a ,int h)
{
double volume= 3.14*a*a*h;
return volume ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the radius");
double a=sc.nextDouble();
System.out.println("Enter the height");
int h=sc.nextInt();
System.out.println(volume(a, h)); 
}

}
