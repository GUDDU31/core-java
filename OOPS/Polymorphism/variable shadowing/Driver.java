/* if a parent class and child class has the same variable with same same
then we call it as variable shadowing */
class A
{
  int a=10;
}

class B extends A
{
	int a=20;
}

class C extends B
{
	int a=30;
}

class D extends C
{
	int a=40;
}

class Driver
{
	public static void main(String[] args) 
	{
	   C c1=new C();
	   System.out.println(c1.a); //30
	   A a1=c1; //upcasting
	   System.out.println(a1.a); //10
	   B b1=(B) a1; // Downcasting
	   System.out.println(b1.a); //20
	   C c2=new D();
	   System.out.println(c2.a); //30
	   D d1=new D();
	   System.out.println(d1.a); //40
	}
}