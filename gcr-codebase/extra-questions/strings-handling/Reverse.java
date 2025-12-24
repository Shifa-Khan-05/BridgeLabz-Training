//Write a Java program to reverse a given string without using any built-in reverse
//functions.
//
import java.util.*;
public class Reverse{

		public static void main(String args[])
		{
		   //creating a scanner object 
		   Scanner sc=new Scanner(System.in);
		   //taking a string input fro user 
		   System.out.println("enter the string");
		   String s=sc.next();
		   System.out.println(reverseString(s));
		}


		public static String reverseString(String input) {
		char c[]=input.toCharArray();
		int left = 0;
		int right = input.length() - 1;
			while (left < right) {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;    			
			left++;
			right--;
			}
		return new String(c);
		   
	}
}