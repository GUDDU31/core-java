// instanceof operator
class A
{
	int k=10;
}

class B extends A
{
	int l=20;
}

class C extends B
{
	int m=30;
}

class D extends C
{
	int n=40;
}

class Driver7
{
	public static void main(String[] args) 
	{
		A a1=new C(); // upcasting
		System.out.println(a1.k); //10
		//System.out.println(a1.l); // CTE

		System.out.println(a1 instanceof B); // true
		B b1=(B)a1; // downcasting
		System.out.println(b1.k); //10
		System.out.println(b1.l); //20
      //System.out.println(b1.m) // CTE

		System.out.println(b1 instanceof C); // true
		C c1=(C) b1; // Downcasting
		System.out.println(c1.k); //10
		System.out.println(c1.l);//20
		System.out.println(c1.m); //30
		//System.out.println(c1.n); // CTE

		System.out.println(c1 instanceof D); // false
		D d1=(D) c1; // class cast exception
	}
}