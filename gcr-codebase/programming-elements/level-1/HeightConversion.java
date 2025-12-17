public class HeightConversion {
	public static void conversion (){
		
		int height = 154;
		double totalfeet = height/30.48;
		double inches = height/2.54;
		
		System.out.println("Your height in cm is "+height + " while in feet is "+ totalfeet +" and inches is "+ inches);
	
	}
	public static void main(String [] args){
		conversion();
	}
 }