 public class Fees {
	public static void discountedFees (){
		
		int fee = 125000;
		int discountPercent=10;
		
		int discount = (fee*discountPercent)/100;
		
		int finalFee= fee-discount;
		
		System.out.println("The discounted amount is INR "+ discount + " and final discounted fee is INR "+ finalFee);
	
	}
	public static void main(String [] args){
			discountedFees();
	}
 }