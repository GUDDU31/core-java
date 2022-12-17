class A1
{
	int a;
	//Parent()
	{
		System.out.println("from A1() constructor");
		a=14;
	}
	{
		System.out.println("from MLNSI of A1 class");
	}
}

class B1 extends A1
{
   int b;
   //Child1()
   {
   	System.out.println("from MLNSI of B1 class");
   	a=10;
   	b=20;
   }



B1()
	{
		System.out.println("from B1() constructor");
	}

	public static void main(String[] args) 
	{
		B1 b1=new B1();
		System.out.println(b1.a);
		System.out.println(b1.b); 
	}
	{
		System.out.println(a);
		System.out.println(b);
	}
}