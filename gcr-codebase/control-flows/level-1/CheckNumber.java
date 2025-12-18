
import java.util.*;

public class CheckNumber{

public static void checknumber(int n)
{
    if(n<0)
	{
	  System.out.println(n + " is a negative number" );
	}
	
	else if(n>0)
	{
	  System.out.println(n + " is a positive number" );
	}
	
	 else
	{
	  System.out.println(n + " is a zero" );
	}
	
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
   
   checknumber(number);

   
   
}

}