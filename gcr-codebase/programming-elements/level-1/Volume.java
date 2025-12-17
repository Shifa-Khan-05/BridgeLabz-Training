public class Volume {
	public static void calculateVolume(){
		
		int radius = 6378;
		double volumeInKm= (4/3)*3.14 * radius*radius*radius;
		
		double miles = 6378*1.6;
		double volumeInMiles = (4/3)*3.14 * miles*miles*miles;
		
		System.out.println("The volume of earth in cubic kilometers is "+ volumeInKm + " and cubic miles is "+ volumeInMiles);
	}
	public static void main(String [] args){
			calculateVolume();
	}
 }