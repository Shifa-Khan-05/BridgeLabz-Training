import java.util.*;
public class SpringSeason {
	
	public static void checkSpring(){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if (month >=3 && month <=6){
			System.out.println("It's a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		
	}
	
	public static void main (String [] args){
		checkSpring();
		
	}
}