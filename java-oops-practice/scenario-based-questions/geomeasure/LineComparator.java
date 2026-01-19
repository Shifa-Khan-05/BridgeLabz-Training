class LineComparator
{

 public static void compareLines(Line line1, Line line2) {
	 
	 
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        if (Double.compare(length1, length2) == 0) {
			
            System.out.println("Both lines are equal in length.");
        } 
		else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } 
		else {
            System.out.println("Line 2 is longer.");
        }
    }


}