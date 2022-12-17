import java.util.Scanner;
class IfElseEx1
{

public static void main(String[] args) 
{
	Scanner s=new Scanner (System.in);

	//System.out.println("from main()");
	
	System.out.println("Enter first number");
	int first=s.nextInt();
	// if (false)
	  
	 System.out.println("Enter second number");

	 int second=s.nextInt();

if (first>second)
 {
	System.out.println("the greatest number is "+first);
}
else
{

	 System.out.println("the greatest number is "+second);	
}
	 }
	
	
}          