class Parent
{
	int a;
	Parent()
	{
		System.out.println("from MLNSI of parent class");
		a=14;
	}
}

class Child1 extends Parent
{
   int b=20;
   Child1()
   {
   	System.out.println("from MLNSI of Child class");
   	System.out.println(a);
   	System.out.println(b);
   	b=20;
   }


//class Driver

	public static void main(String[] args) 
	{
		System.out.println("from main()");
		Child1 ch1=new Child1();
		System.out.println(ch1.a); 
		System.out.println(ch1.b);
	}
}