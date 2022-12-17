class A
{
	public static void main(String[] args) 
	{
		B b1=new B();
		System.out.println(b1.getter()); // 10 , indirect access
        b1.setter (20);
        System.out.println(b1.getter()); //20
	
	
	}
}