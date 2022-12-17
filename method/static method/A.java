// case 1..Accessing the static method within the same class
class A
{
	public static void test ()
	{
		System.out.println("from test() of class a");
	}
	public static void main(String[] args) {
		System.out.println("Accessing the method directory with its name");
		test ();
		System.out.println("Accessing the method with the help of class name");
		A.test();
		System.out.println("Accessing the method with the help of Object refrence");
		A a1= new A ();
		a1. test ();
	}
}