 // Can be overload main method? yes :-

class CompileTime4
{
	public static void main(String[] args) 
	{
       System.out.println("from main(String[] args");	
	}

	public static void main()
	{ 
		System.out.println(" from main()");
	}

	public static void main(int a)
	{
		System.out.println("from main(int)");
	}
}