import java.util.*;
public class Factorial{
	
	public static void calculateFactorial(){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact =1;
		
		while(number>0){
			fact*=number;
			number--;
		}
		
		System.out.println(fact);
		
	}
	
	public static void main (String [] args){
		calculateFactorial();
		
	}
}