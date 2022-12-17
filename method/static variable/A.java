// example 1.
class A
{
	static int k; // static variable
	public static void main(String[] args) {
	 System.out.println(k); // directaly
	 System.out.println(A.k); // with the help of class name
	 A a1=new A ();
	 System.out.println(a1.k); // object refrence
	}

}