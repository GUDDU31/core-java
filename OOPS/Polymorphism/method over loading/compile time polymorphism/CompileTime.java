 // compile time polymorphism( by changing no of arguments.)

class CompileTime
{
	public static void main(String[] args) 
	{
       add (10,20,30); // from add(int,int,int)
       add (2,6); // from add(int,int)		
	}

	public static void add(int a)
	{ 
		System.out.println(" from add(int)");
	}

	public static void add(int a, int b)
	{
		System.out.println("from add(int,int)");
	}

	public static void add(int a, int b, int c)
	{
		System.out.println("from add(int, int, int)");
	}
}