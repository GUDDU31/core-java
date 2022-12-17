/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (stringBuffer)*/
class Sbuffer
{
	public static void main(String[] args) 
	{
		
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("world");
		System.out.println(s1);//hello
		System.out.println(s2);// world
		s1.append(s2);
		System.out.println("after appending");
		System.out.println(s1);//helloworld
		System.out.println(s2);// world
	}
}