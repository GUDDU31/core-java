/*inheritance of an interface by the class*/
interface I1
{
	public void m1();
	public void m2();
}

abstract class A implements I1
{

}

class B extends A
{
	public void m1()
	{
		System.out.println("from m1() of B class");
	}
	public void m2()
	{
		System.out.println("from m2() of B class");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		I1 i=new B();
		i.m1(); // from m1() of B class
		i.m2(); // from m2() of B class
	}
}