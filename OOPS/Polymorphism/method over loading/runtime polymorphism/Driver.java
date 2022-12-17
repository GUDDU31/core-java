 /* runtime polymorphism (method over riding) */

class Parent
{
	public  void test() 
	{
	   System.out.println("from Parent class()");
	}
}

	class Child extends Parent
{
	public void test()
	{
       System.out.println(" from Child class()");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		p1.test(); // from Parent class()
		Child ch1 = new Child();
		ch1.test(); // from Child class()
		Parent p2= ch1;
		p2.test(); // from Child class()

		Parent p3= new Child();
		p3.test();// from Child class()

		Child ch2= (Child) p3; // Downcasting
		ch2.test(); // from Child class()
	}
}