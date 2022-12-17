// WAJP to read a no. from  user and check the sum of digits of the number.
import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
	 	System.out.println("enter a digit");

	 	int num=s.nextInt();
	
	 	int sum=0;

	 	for (int i=num; i!=0;  i=i/10 )
	 	 {
	 	 	int rem= i%10;
	 	 	sum=sum+rem;
	 	 	System.out.println("the number is "+sum);
	 	}
		
	}
}
