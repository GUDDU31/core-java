// switch example for weekly roughting
import java.util.Scanner;
class TimeTable
{
	public static void main(String[] args) 
	 {
		
	
	Scanner s=new Scanner (System.in);
	System.out.println("enter a day");
	String day=s.next();

	switch (day) 
    {
        
    
	 case "monday":;
	 case " Thursday":;
	 	{
	 		System.out.println("Tennis");
	 	}
	 	break;

	 case "Tuesday":;
	 case "Saturday":;
	 	{
            System.out.println("Cricket");
	 	}
	 	break;

	 case "Wednesday":;
	 	{
	 		System.out.println("Football");
	 	}
	 	break;

	 case "Friday":;
	 	{
	 		System.out.println("Hockey");
	 	}
	 	break;

	 case "Sunday":;
	 	{
	 		System.out.println("Holiday");
	 	}
	 	break;

	 default:
	 	{
	 		System.out.println("invalid day");
	 	}
	 }
	 }
	}