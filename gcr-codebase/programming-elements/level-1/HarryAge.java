class CalculateAge
{
public static int Age(int n)
{    
int currentyear=2024;
    int age=currentyear-n;
	return age;
}

	public static void main (String args[])
	{
	int birthyear=2000;
	  System.out.println( Age(birthyear)); 
	}

}
