class MethodReturn
{
	public static void main(String[] args) 
	{
		System.out.println("from main()"); 
		ram();
		System.out.println("end of main(()");
		
		}
		public static void ram ()
		{
			System.out.println("Hi... from ram !!");
			int res= sheela (1000);
			System.out.println(res); //500
		}
		public static int sheela (int money)
		{
			System.out.println("hello  ram !!");
			System.out.println("sheela starts execution");
		
			return 500;
	}
}