
import java.util.*;

public class SumOfNaturalNum{

public static void sum(int n)
{
  int sum=0;
    
  if(n>=0)
  {
	  int sum2=n*(n+1)/2;
	  while(n>=1)
	  {
	   sum+=n;
	   n--;
	  }
    
	if(sum==sum2)
	{
	  System.out.println(" both are equal " + sum);
	}
	else 
	System.out.println("both are not equal");
	
  }
  
  
  
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
  
   sum(number);

   
   
}

}