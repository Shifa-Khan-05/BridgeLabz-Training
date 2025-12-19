import java.util.*;
public class CalculateBonus{
	
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	
	// created variable to store salaries and year of service
	double salaries [] = new double[10]; 
	double yearsOfService [] = new double[10];
	
	//Created for loop to take input of salaries and years of service
	for (int i=0; i<10; i++){
		System.out.println("Enter the salary amount of " + (i+1) + " Employee" );
		double sal = sc.nextDouble();
		
		
		System.out.println("Enter the years of service of " + (i+1) + " Employee" );
		double years = sc.nextDouble();
		
		// check for error inputs
		if (sal <= 0 || years < 0) {
			System.out.println("Invalid input! Please enter again.");
			i--; // decrement index as required
		continue;
		}
			salaries[i] = sal;
			yearsOfService[i] = years;
	}
	
	//created two new double variables to store new salaries and bonus amount
	double newSalary [] = new double [10];
	double bonus [] = new double [10];
	
	
	//create for loop to check the eligibility of bonus of (2%) or (5%) 
	for (int i=0; i<10; i++){
		if(yearsOfService[i] > 5){
			bonus[i]= (salaries[i] * 5)/100;
		}
		else{
			bonus[i]= (salaries[i] * 2)/100;
		}
		newSalary[i] = (salaries[i]+ bonus[i]);
	}
	
	// Print bonus and new salary of each employee by using for loop
	for (int i=0; i<10; i++){
		System.out.println("The Employee bonus is :  " + bonus[i] );
		System.out.println("The Employee new salary is :  " + newSalary[i] );
	}	
	
	// created few more double variables to store total bonus, total old salary & total New Salary
	double totalbonus=0; 
	double totalOldSalary=0;
	double totalNewSalary=0;
	
	
	// Calculate the total bonus, total old salary & total New Salary 
	for (int i=0; i<10; i++){
		totalbonus+= bonus[i];
		totalOldSalary+=salaries[i];
		totalNewSalary+=newSalary[i];
	}
	
	// Printed the total bonus, total old salary & total New Salary 
	System.out.println("The Total Bonus is :  " + totalbonus );
	System.out.println("The Total Old Salary is :  " + totalOldSalary );
	System.out.println("The Total New Salary is :  " + totalNewSalary );
	
	sc.close();
	}
}