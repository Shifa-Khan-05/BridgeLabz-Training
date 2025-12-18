
import java.util.*;

public class CountDown2{

public static void countdown(int n)
{
   for(int i=n;i>=1;i--)
   {
      System.out.println(i);
	  
   }
	
}
public static void main(String args[])
{

   Scanner sc=new Scanner(System.in); 
   int number=sc.nextInt();
   
   countdown(number);

   
   
}

}