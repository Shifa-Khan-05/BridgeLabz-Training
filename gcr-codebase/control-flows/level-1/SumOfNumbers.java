import java.util.*;
public class SumOfNumbers{
	
	public static void calculateSum(){
		Scanner sc = new Scanner(System.in);
		double total =0.0;
		double user= sc.nextDouble();
		
		while(user!=0){
			
			
			total += user;
			user=sc.nextDouble();
		}
		System.out.println("The total Is " + total);
		
	}
	
	public static void main (String [] args){
		calculateSum();
	}
}