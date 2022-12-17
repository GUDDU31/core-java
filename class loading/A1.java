// Class Loading process example 4
class A1
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("from main() of A1");
		m1();
		}
		public static void m1()
		{
			System.out.println(B1.k);
	}
}