class D2  
{
	static int a;
	static
	{
		System.out.println(a);
	}
	static int b=30;
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		System.out.println(a);
		System.out.println(b);
	}
	static
	{
		System.out.println(a);
		System.out.println(b);
		a=20;
		b=12;
	}
}