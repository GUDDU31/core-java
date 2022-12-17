class Demo3
{
	static int a;
	int b;
	Demo3 ()
	{
		System.out.println("programmer written instructions");
	}
		static
		{
			System.out.println("from MLSI");
			System.out.println(a);
		}
	static int c=20;
	int d=40;
	{
		System.out.println("from MLNSI");
	}
	public static void main(String[] args) 
	{
		System.out.println("FROM MAIN()");
		Demo3 d1=new Demo3 (); 
		System.out.println(a); 
		System.out.println(c);  
		System.out.println(d1.b); 
		System.out.println(d1.d); 
		
	}
}