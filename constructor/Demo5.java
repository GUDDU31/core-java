class Demo5
{
	static int i;
	int k;
	Demo5 (int a, int b)
	{
		System.out.println("from Demo5(int, int)");
		k=a;
		j=b;
	}
		static
		{
			System.out.println(i);
			i=20;
		}
	     int j=30;
	     static int l=20;

	{
		System.out.println(k);
		System.out.println(l);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("FROM MAIN()");
		System.out.println(i);
		System.out.println(l);
		Demo5 d1=new Demo5 (10,20); 
		Demo5 d2=new Demo5 (40,50);
		 System.out.println(d1.k);
		  System.out.println(d1.j);
		System.out.println(d2.k); 
		System.out.println(d2.j); 
		
	}
}