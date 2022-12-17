 // compile time polymorphism( by changing type of arguments.)

class CompileTime1
{
	public static void main(String[] args) 
	{
       add (10, 20); // from add(int,int)
       add (12, 36.5); // from add(int,double)		
	}

	public static void add(int a, float b)
	{ 
		System.out.println(" from add(int,float)");
	}

	public static void add(int a, int b)
	{
		System.out.println("from add(int,int)");
	}

	public static void add(int a, double b)
	{
		System.out.println("from add(int, double)");
	}
}