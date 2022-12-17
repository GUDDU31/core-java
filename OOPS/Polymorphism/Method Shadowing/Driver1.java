 /* runtime polymorphism (method shadowing) */

class Parent
{
	public static void test() 
	{
	   System.out.println("from Parent class()");
	}
}

	class Child extends Parent
{
	public static void test()
	{
       System.out.println(" from Child class()");
	}
}

class Driver1
{
	public static void main(String[] args) 
	{
		Parent p1=new Parent();
		p1.test(); // from Parent class test()
		Child ch1 = new Child();
		ch1.test(); // from Child class test()
		Parent p2= ch1;
		p2.test(); // from Parent class test()

		Parent p3= new Child();
		p3.test();// from Parent class test()

		Child ch2= (Child) p3; // Downcasting
		ch2.test(); // from Child class test()
	}
}