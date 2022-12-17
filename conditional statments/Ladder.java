//voting eligiblity
import java.util.Scanner;
class Ladder
{
	public static void main(String[] args)
	 {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int num=s.nextInt();

		if (num>0)
		 {
		 	System.out.println("it is a positive value");
		 }
		 else if(num<0)
		 {
		 		System.out.println("it is a negative value");
		 }
		 else
		 	System.out.println(num+ " is zero");
		 	}
			
		}

