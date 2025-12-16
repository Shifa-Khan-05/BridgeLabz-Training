import java.util.*;
class Power
{

public static int power(int b ,int e)
{
int pow=1;
for(int i=1;i<=e;i++)
{
 pow*=b;
}

return pow ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the base");
int b=sc.nextInt();
System.out.println("Enter the exponent");
int e=sc.nextInt();

System.out.println(power(b,e)); 
}

}
