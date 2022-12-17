// WAJP to read even no. from the user input
import java.util.Scanner;
class ForLoop1
{
	public static void main(String[] args)
	Scanner s=new Scanner(System.in);
	System.out.println("enter the starting number");
	int start=s.nextInt(); //1

	System.out.println("enter the ending number");
	int end=s.nextInt(); //10
	for (int i= start; i<=end ; i++ )
	 {
	 	if(i%2==0)
	 	{
	 		System.out.println(i);
	 	}
		
	}

	 
}  
