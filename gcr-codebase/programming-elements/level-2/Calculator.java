
import java.util.*;
public class Calculator {

public static void calculator(int a, int b)
{
  int add=a+b;
  int subtraction=Math.abs(a-b);
  int multiplication= a*b;
  int division=a/b;
  
  System.out.println("The addition, subtraction, multiplication and division value of 2 numbers" + a +  "and"+ b + " is " + add +" " +  subtraction+ " " + multiplication  + " "+ division);
  
  
}


public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int number1=sc.nextInt();
  int number2=sc.nextInt();
  calculator(number1,number2); 
}

}