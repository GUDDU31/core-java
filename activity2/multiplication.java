/*1.WAJP to read a number  from the user and create a method to accept that number and print
multiplication table of that number*/
import java.util.Scanner;
class multiplication
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		multi (num);
	}
	public static void multi(int a)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(a+"*"+"= "+(a*i));
		}
	}
}