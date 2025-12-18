import java.util.*;
public class Voting{
	
	public static void checkVotingEligibility(){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age>= 18){
			System.out.println("The person's age is "+ age +" and can vote.");
		}
		else {
			System.out.println("The person's age is "+ age +" and cannot vote.");
		}
		
		
	}
	
	public static void main (String [] args){
		checkVotingEligibility();
		
	}
}