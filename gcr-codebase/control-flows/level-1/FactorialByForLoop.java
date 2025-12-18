import java.util.*;
public class FactorialByForLoop{
	
	public static void calculateFactorial(){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact =1;
		
		for(int i=number; i>0; i--){
			fact*=number;
			number--;
		}
		
		System.out.println(fact);
		
	}
	
	public static void main (String [] args){
		calculateFactorial();
		
	}
}