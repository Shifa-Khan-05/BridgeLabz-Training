import java.util.*;
public class IsDivisible{

public static void isdivisible(int n)
{    
System.out.println(" Is the number " + n +" divisible by 5? ");
    if(n%5==0)
	{
	     System.out.println("Yes");
	}
	else
	{
	   System.out.println("No");
	}
	
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
   isdivisible(number);
   
}

}