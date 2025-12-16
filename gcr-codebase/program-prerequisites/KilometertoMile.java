import java.util.*;
class KilometertoMiles
{

public static int kilotomile(int a)
{
int p=a* 0.621371;
return p ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Miles");
int a=sc.nextInt();

System.out.println(kilotomile(a)); 
}

}
