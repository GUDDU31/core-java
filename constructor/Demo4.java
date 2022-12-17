class Demo4
{
	static int a;
	int b=10;
	Demo4 (int var1, int var2)
	{
		System.out.println("from Demo4(int, int)");
		b=var1;
		d=var2;
	}
		static int c=15;
		 int d;
		{
			System.out.println(b);
			System.out.println(d);
		}
	static

	{
		System.out.println(a);
		a=22;
		c=40;
	}
	public static void main(String[] args) 
	{
		System.out.println("FROM MAIN()");
		System.out.println(a);
		System.out.println(c);
		Demo4 d1=new Demo4 (-4,8); 
		 
		  
		System.out.println(d1.b); 
		System.out.println(d1.d); 
		
	}
}