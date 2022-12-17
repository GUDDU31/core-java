// Class Loading process example 3
class CL3
{
	static int i;
	static int j;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		j=20;
		m1();
		}
		public static void m1()
		{
			System.out.println(j);
	}
}