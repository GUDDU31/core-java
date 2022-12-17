class Demo2
{
	int a;
	int b;
	Demo2 (int var1, int var2)
	{
		System.out.println("from Demo2 (int, int) constructor");
		a= var1;
		b= var2; // programmer written instructions
	}
	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2 (10,20); // object creation statement
		System.out.println(d1.a); //10
		System.out.println(d1.b); //20
		Demo2 d2= new Demo2 (100,50); // object creation statement
		System.out.println(d2.a); //100
		System.out.println(d2.b); //50
		
	}
}