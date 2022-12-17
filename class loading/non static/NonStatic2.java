class NonStatic2
{
	int k;
	{
		System.out.println("from MLNSI1");
		System.out.println(k);
	}
	int a=25;
	{
		System.out.println("from MLNSI2");
		k=12;
		System.out.println(k);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		System.out.println("from main()");
		NonStatic2 n1=new NonStatic2();
		NonStatic2 n2=new NonStatic2();
		System.out.println(n1.a);
		System.out.println(n1.a);
		System.out.println(n1.a);
		System.out.println(n1.a);
		}

		{
			System.out.println("from MLNSI3");
			a=10;
			k=20;
	}
}