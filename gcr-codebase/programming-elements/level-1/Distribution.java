public class Distribution {

public static void distribution()
{
   int pens=14;
   int students=3;;
   int peneach=pens/students;
   int remaining=pens%students;
   System.out.println("The Pen Per Student is " + peneach + " and the remaining pen not distributed is " + remaining );

  
}
public static void main(String args[])
{
     distribution();
}

}