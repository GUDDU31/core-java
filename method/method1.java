class method1
{
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		test(); // method call statements...
		System.out.println("end of main()");
		
	}
	public static void test ()
	{
		System.out.println("from test()");
	}
}