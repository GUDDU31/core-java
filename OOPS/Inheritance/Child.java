class Parent
{
	int a=10;
	Parent()
	{
		super ();
	}
}

class Child extends Parent
{
   int b=20;
   Child()
   {
   	super();
   }


//class Driver

	public static void main(String[] args) 
	{
		Child ch1=new Child();
		System.out.println(ch1.a); //10
		System.out.println(ch1.b); //20
		//A a1=new A();
		//System.out.println(a1.x); //0
		//System.out.println(a1.y); //CTE
	}
}