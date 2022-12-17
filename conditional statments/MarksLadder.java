// marks according to their score ladder..
import java.util.Scanner;
class MarksLadder
{
	public static void main(String[] args)
	 {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter your mark");
	int marks=s.nextInt();

	if (marks>=81 && marks<=100)
	 {
	 	System.out.println("first division Outstanding");
     }
     else if (marks>=60 && marks<=80) 
     {
     	
     System.out.println("first division");    
     	
     }

else if (marks>=45 && marks<=59) 
{
 System.out.println("second division");	
}

else if (marks>=30 && marks<=44)
{
System.out.println("third division");
}


	else
	{
     System.out.println("fail");
	}	
	}
}