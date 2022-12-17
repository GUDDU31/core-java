/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (using concat method. case 2)*/
class Ex4
{
	public static void main(String[] args) 
	{
		String s1="hello";
		System.out.println(s1);//hello
		s1=s1.concat("world");
		System.out.println(s1);// hello world
	}
}