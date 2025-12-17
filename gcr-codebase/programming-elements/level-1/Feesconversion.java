import java.util.*;

class Feesconversion {

public static void feess(int discountPercent, int fee)
{
   		
		int discount = (fee*discountPercent)/100;
		
		int finalFee= fee-discount;
		
		System.out.println("The discounted amount is INR "+ discount + " and final discounted fee is INR "+ finalFee);
	
}
public static void main(String args[])
{
   	Scanner sc= new Scanner(System.in);
        int fees=sc.nextInt();	
		int discountPercent=sc.nextInt();
	    feess(discountPercent, fees);
      
}

}