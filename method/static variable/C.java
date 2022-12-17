// example 3.
class C
{
	static int a; // static variable
	public static void main(String[] args) {
	 int a=10; // local variable
	 System.out.println(a); //10
	 A a1=new A ();
	 System.out.println(C.a); // 0
	}

}