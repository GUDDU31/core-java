class NonStatic1
{
	int a=16;  //Single line non static initializer

	{
		System.out.println("from MLNSI");

		System.out.println(a);
		a=7;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		  //System.out.println(a); Compile time error
		NonStatic1 ns1=new NonStatic1
		System.out.println(ns1.a);
	}
	{

	//public static int test()
	
		System.out.println("from MlNsI2");
		
	}
}