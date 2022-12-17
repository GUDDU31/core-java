// datting aap according to their age..
import java.util.Scanner;
class DattingApp
{
	public static void main(String[] args)
	 {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=s.nextInt();

	if (age>=21 && age<=35)
	 {
	 	System.out.println("your match is found");
     }
     else if (age>=36 && age<=50) 
     {
     	
     System.out.println("its Complicated but carry your journey");    
     	
     }

else if (age>50) 
{
 System.out.println("better for next life");	
}

	else
	{
     System.out.println("first grow then come");
	}	
	}
}