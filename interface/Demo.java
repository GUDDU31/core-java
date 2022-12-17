/*interface:- it is a component of a java which is used to
 achieve 100% abstraction*/
interface Demo
{
	int a=10;
	// a=20; // CTE(final variable can't be initialized)
	public static void main(String[] args) 
	{
		System.out.println("from main() of Demo");
		System.out.println(a); //10
	}
}