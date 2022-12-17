class A
{
	int x;
}

class B extends A
{
   int y;
}

class Driver
{
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.x); //0
		System.out.println(b1.y); //0
		A a1=new A();
		System.out.println(a1.x); //0
		//System.out.println(a1.y); //CTE
	}
}