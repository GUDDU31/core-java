class E2  
{
	static int a=test();
	static int b=20;
	static
	{
		System.out.println(a);
		a=20;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		//System.out.println("from main()");
		System.out.println(a);
		System.out.println(b);
		test ();
	}
	public static int test()
	{
		System.out.println(b);
		return 25;
	}
}