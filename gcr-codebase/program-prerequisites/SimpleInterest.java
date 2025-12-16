import java.util.*;
class SimpleInterest
{

public static double simpleInterest(int p ,int r,int t)
{
double SI= (p*r*t)/100;
return SI ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the principle");
int a=sc.nextInt();
System.out.println("Enter the rate");
int h=sc.nextInt();
System.out.println("Enter the time");
int t=sc.nextInt();

System.out.println(simpleInterest(p, r,t)); 
}

}
