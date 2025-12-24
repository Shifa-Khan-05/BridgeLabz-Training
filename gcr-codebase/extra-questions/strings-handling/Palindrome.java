//Write a Java program to check if a given string is a palindrome 
import java.util.*;
		public class Palindrome{

		public static void main(String args[]){
		   //creating a scanner object 
		   Scanner sc=new Scanner(System.in);
		   //taking a string input fro user 
		   System.out.println("enter the string");
		   String s=sc.next();
		   System.out.println(isPalindrome(s));
			
		}

       //method for check is palindrome or not 
		public static boolean isPalindrome(String input) {
		int left = 0;
		int right = input.length() - 1;
		//using while loop and compare the character at any index 
			while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
			return false;
			}
			left++;
			right--;
			}
		return true;
	}
}