
import java.util.*;

public class Smallest{

public static void smallest(int n1, int n2, int n3)
{
    if(n1<n2 && n1<n3)
	{
	  System.out.println(n1 + " is the smallest" );
	}
	
	 if(n2<n1 && n2<n3)
	{
	  System.out.println(n2 + " is the smallest" );
	}
	
	 if(n3<n2 && n3<n2)
	{
	  System.out.println(n3 + " is the smallest" );
	}
	
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number1=sc.nextInt();
   int number2=sc.nextInt();
   int number3=sc.nextInt();
   smallest(number1,number2,number3);

   
   
}

}