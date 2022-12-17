/*solution of diamond problem*/
interface I2
{
	public void m1();
}

interface I3
{
   public void m1();
}

class A implements I2, I3
{
	public void m1()
	{
		System.out.println("from m1() of A class");
	}
}

class Driver2
{
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m1(); // from m1() of A class
	}
}