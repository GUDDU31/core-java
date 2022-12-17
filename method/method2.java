class method2
{
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		test(); // method call statements...
		System.out.println("end of main()");
		m1 ();
		System.out.println("main() continues execution");
		test();
	}
	public static void m1 ()
	{
		System.out.println("m1() execution");
		test ();
	}
	public static void test()
	{
       System.out.println("test () execution");
	}
	
}