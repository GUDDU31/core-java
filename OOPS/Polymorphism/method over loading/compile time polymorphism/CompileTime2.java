 // Method Overloading  based on type promotion

class CompileTime2
{
	public static void main(String[] args) 
	{
       add (10, 20); // from add(int,float)	
	}

	public static void add(int a, float b)
	{ 
		System.out.println(" from add(int,float)");
	}

	public static void add(int a, char b)
	{
		System.out.println("from add(int, char)");
	}
}