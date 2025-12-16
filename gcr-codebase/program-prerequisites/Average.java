import java.util.*;
class Average
{

public static double average(int a,int b ,int c)
{
 double avg=(a+b+c)/3;
return avg ;
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the first digit");
int a=sc.nextInt();
System.out.println("Enter the second digit");
int b=sc.nextInt();
System.out.println("Enter the third digit");
int c=sc.nextInt();

System.out.println(average(a,b,c)); 
}

}
