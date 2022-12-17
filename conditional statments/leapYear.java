// leap year ladder
import java.util.Scanner;
class leapYear
{
	public static void main(String[] args)
	 {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the year");
	int year=s.nextInt();

	if (year%400==0)
	 {
	 	System.out.println(year+ " is leap Year");
     }
     else if (year%4 ==0 && year%100!=0) 
     {
     	
     System.out.println(year+" is leap Year");    
     	
     }


	else
	{
     System.out.println(year+" is not leap year");
	}	
	}
}