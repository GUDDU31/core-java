/* convert all primitive data type into char data Assignment No.1 */
class  ConvertIntoChar 
{
	public static void main(String[] args) 
	{
		byte   a=65;
		short  b=66;
		int    c=67;
		long   d=68l;
		float  e=69.0f;
		double f=70.0;
		System.out.println("Before converting");
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println("After converting into char");
		System.out.println((char)a); 
		System.out.println((char)b);
		System.out.println((char)c);
		System.out.println((char)d);
		System.out.println((char)e);
		System.out.println((char)f);
	}
}
