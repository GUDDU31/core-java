import java.util.Scanner;
class DR1
{

public static void main(String[] args) 
{
	Scanner s=new Scanner (System.in);

	System.out.println("Enter first number");
	int first=s.nextInt();

	System.out.println("Enter second number");
	int second=s.nextInt();

	int sum= first+second;
	System.out.println(sum);
}
}