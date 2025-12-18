
import java.util.*;

public class NaturalNumber{

public static void isNatural(int n)
{
int sum =0;
    if(n>=0)
	{
	   sum= n * (n+1) / 2 ;
	   System.out.println("The sum of " +  n +"natural numbers is " + sum);

	}
	else
	{
	   System.out.println("The number " +  n +" is not a natural number ");
	}
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
   
   isNatural(number);

   
   
}

}