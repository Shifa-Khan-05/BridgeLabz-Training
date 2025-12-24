//Write a Java program to count the number of vowels and consonants in a given string.
import java.util.*;
public class VowelConsonants{

		public static void main(String args[])
		{
		   //creating a scanner object 
		   Scanner sc=new Scanner(System.in);
		   //taking a string input fro user 
		   System.out.println("enter the string");
		   String s=sc.next();
		   isVowelConsonants(s);
		}


		public static void isVowelConsonants(String input) {
		
		    int vowelcount=0;
			int consonantcount=0;			
		   for(int i=0;i<input.length();i++)
		   {
			   if(input.charAt(i)== 'a' || input.charAt(i)== 'e' || input.charAt(i)== 'o' || input.charAt(i)== 'i' || input.charAt(i)== 'u') 
			   {
				   vowelcount++;
			   }
			   else{
				  consonantcount++;				  
			   }
				   
		   }
			
			System.out.println(" Number of vowels = " + vowelcount);
			System.out.println(" Number of consonants = " + consonantcount);
		}
}