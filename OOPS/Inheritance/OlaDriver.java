class Ola
{
	String starting;
	String destination;
	Ola(String start, String end)
	{
		this.starting= start;
		this.destination= end;
	}
}

class Bike extends Ola
{
   double price=5;

   Bike (String start, String end)
   {
   	super(start, end);
   	}
   	public void getBikeAttributes()
   	{
   		System.out.println("starting point = "+ this.starting);
   		System.out.println("destination point = "+ this.destination);
   		System.out.println("cost per km for Bike = " +this.price);
   	}
   }

   class Auto extends Ola
   {
    double price=7;

   Auto (String start, String end)
   {
   	super(start, end);
   	}
   	public void getAutoAttributes()
   	{
   		System.out.println("starting point = "+ this.starting);
   		System.out.println("destination point = "+ this.destination);
   		System.out.println("cost per km for Auto = " +this.price);
   	}
   }


class OlaDriver
    {
	public static void main(String[] args) 
	{
		Bike b1=new Bike("gopalganj", "siwan");
		b1.getBikeAttributes();
		Auto a1=new Auto("gopalganj", "siwan");
		a1.getAutoAttributes();

	}
}