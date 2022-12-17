class A2
{
	static int a=10; // single line static initializer
	static
	{
		System.out.println(" from mlsi");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main()");
		System.out.println(a);
		System.out.println("end of main()");
	}
}