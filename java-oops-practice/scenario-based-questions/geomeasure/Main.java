import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1: as x1,y1,x2,y2");
        Line line1 = new Line(
            sc.nextDouble(), sc.nextDouble(),
            sc.nextDouble(), sc.nextDouble()
        );

        System.out.println("Enter coordinates for Line 2: as x1,y1,x2,y2");
        Line line2 = new Line(
            sc.nextDouble(), sc.nextDouble(),
            sc.nextDouble(), sc.nextDouble()
        );

        LineComparator.compareLines(line1, line2);
    }
}
