class logical1 //&&
{
	public static void main(String[] args) 
	{
		int a=12;
		int b=8;
	
	System.out.println(--a>=b++ && ++b<=a--); //true
	System.out.println(a++>=b-- && a++<=++b); // false
	System.out.println(--b>=++a && !(++a<=b--)); // false
	System.out.println(!(--a<=--b) && ++b<=a--); //false

	System.out.println(a); //11
		System.out.println(b); //9


	}
}
