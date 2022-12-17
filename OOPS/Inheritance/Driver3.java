// up casting
class Parent3
{
	int a=10;
}

class Child3 extends Parent3
{
	int b=20;
}

class Driver3
{
	public static void main(String[] args) 
	{
		Child3 ch1=new Child3();
		System.out.println(ch1.a); //10
		System.out.println(ch1.b); //20

		Parent3 p1=ch1; // upcasting
		System.out.println(p1.a);  //10
		/*System.out.println(p1.b);  CTE(using upcasted ref. variable we 
		we can't access the child class members) */
	}
}