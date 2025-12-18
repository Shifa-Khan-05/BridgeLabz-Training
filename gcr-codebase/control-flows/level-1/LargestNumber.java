import java.util.*;
public class LargestNumber {
	
	public static void checkLargest (){
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		if (number1>number2 && number1>number3){
			System.out.println("The number "+ number1 +" is Largest");
		}
		else if (number2>number1 && number2>number3){
			System.out.println("The number "+ number2 +" is Largest");
		}
		else{
			System.out.println("The number "+ number3 +" is Largest");
		}
	}
	
	public static void main (String [] args){
		checkLargest();
	}
}