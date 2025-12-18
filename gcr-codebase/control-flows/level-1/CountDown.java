
import java.util.*;

public class CountDown{

public static void countdown(int n)
{
   while(n>=1)
   {
      System.out.println(n);
	  n--;
   }
	
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
   
   countdown(number);

   
   
}

}