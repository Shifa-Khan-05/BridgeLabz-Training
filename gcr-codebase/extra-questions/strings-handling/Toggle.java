
//Write a Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.
import java.util.*;

public class Toggle {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String s = sc.nextLine();
		
		System.out.println(" to uppercase " + toUpperCaseConvert(s));
		System.out.println(" to lowercase " + toLowerCaseConvert(s));
        sc.close();
    }

    public static String toUpperCaseConvert(String s) {
	  String uppercase="";
	  for(int i=0;i<s.length();i++)
	  {
	     char ch=s.charAt(i);
		 if(ch>='a' && ch<='z')
		 {
		 ch=(char)(ch - 32); 
	  }
	 
		uppercase+=ch;
    }
	 return uppercase;
}

    public static String toLowerCaseConvert(String s) {
	  String lowercase="";
	  for(int i=0;i<s.length();i++)
	  {
	     char ch=s.charAt(i);
		 if(ch>='A' && ch<='Z')
		 {
		 ch=(char) (ch + 32); 
	  }
	 
		lowercase+=ch;
    }
	 return lowercase;
}
}
