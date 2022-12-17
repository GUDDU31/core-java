class C2  //  B2+C2
{
	//static int a=10; // single line static initializer
	static
	{
		System.out.println(" from mlsi of class C2");
	}
	static int m=25;
	public static void main(String[] args) 
	{
		System.out.println("from main() of class C2");
		//System.out.println(C2.m);
		
	}
}