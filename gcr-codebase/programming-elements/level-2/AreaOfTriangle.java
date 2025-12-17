
import java.util.*;
public class AreaOfTriangle {

public static void areaOfTriangle(int a, int b)
{
   double area= 0.5 * b *a;
   double inch=area/2.54;
  
  System.out.println("The Area of the triangle in sq in is " + inch  + " and sq cm is " + area);
  
  
}


public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int base=sc.nextInt();
  int height=sc.nextInt();
  areaOfTriangle(base,height);
}

}