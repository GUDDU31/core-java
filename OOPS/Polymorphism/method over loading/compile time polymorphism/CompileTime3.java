 // Ambiquity error example:-

class CompileTime3
{
	public static void main(String[] args) 
	{
       add (10, 20); // CTE (Ambiquity error)	
	}

	public static void add(int a, float b)
	{ 
		System.out.println(" from add(int,float)");
	}

	public static void add(float a, int b)
	{
		System.out.println("from add(float, int)");
	}
}