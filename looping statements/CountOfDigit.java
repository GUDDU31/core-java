// WAJP to read a no. from  user and count the no. of digits present in the number.
import java.util.Scanner;
class CountOfDigit
{
	public static void main(String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
	 	System.out.println("enter a digit");

	 	int num=s.nextInt();
	
	 	int count=0;
	 	for (int i=num; i!=0;  i=i/10 )
	 	 {
	 	 	count++;
	 	 }
	 	 	System.out.println("the number is "+count);
	 	 	
	 		

	 	
		
	}
}
