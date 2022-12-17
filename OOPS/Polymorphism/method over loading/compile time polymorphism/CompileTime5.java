 /* type promotion is always prefered by our compiler to
    the  nearest data type */

class CompileTime5
{
	public static void main(String[] args) 
	{
    add (10);  // from add (float)
	}

	public static void add(double a)
	{
       System.out.println("from add(double");	
	}

	public static void add(float a)
	{ 
		System.out.println(" from add(float)");
	}
}