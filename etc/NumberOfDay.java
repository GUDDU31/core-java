// switch example for leap year or no. of days in months according to their orders
import java.util.Scanner;
class NumberOfDay
{
	public static void main(String[] args) 
	 {
	Scanner s=new Scanner (System.in);
	System.out.println("enter name of month");
	int month=s.nextInt();
    System.out.println("enter name of year");
    int year=s.nextInt();

	switch(month) 
    {
        
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
	 	{
	 		System.out.println("31 days");
	 	} break;

	 case 4:
	 case 6:
	 case 9:
	 case 11:
	 	{
	 		System.out.println("30 days");
	 	} break;

     
	 /* if (year%400==0 || year%4==0 && year%100!=0)
     {
        System.out.println("29 days");
     }

     else
     {
       System.out.println("28 days");
     }break;*/

     default:
     {
        System.out.println("invalid key");
     }
    }}}


