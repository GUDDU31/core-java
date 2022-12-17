// example 2.
class B
{
	//static int k; // static variable
	public static void main(String[] args) {
	 //System.out.println(k); // compile time error
	 System.out.println(A.k); //0
	 A a1=new A ();
	 System.out.println(a1.k); // 0
	}

}