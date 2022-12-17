/*2.WAJP to read two number  from the user and create a method to accept those two numbers and
muprint the sum of two numbers of without returning anything*/
import java.util.Scanner;
class sum
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter first number");
		int first=s.nextInt();
		System.out.println("enter second number");
		int second=s.nextInt();
         
		sum (first, second);
	}
	public static void sum(int a, int b)
	{
			System.out.println("sum of two number is "+(a+b));
		}
	}
