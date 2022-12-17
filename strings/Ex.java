/*String literal:- Anything which is enclose with double code (" ")
is known as string literal*/
class Ex
{
	public static void main(String[] args) 
	{
		String name1="ram";
		String name2="ram"; 
		System.out.println(name1);//ram
		System.out.println(name2);// ram
		System.out.println(name1==name2); // true
		System.out.println(name1.equals(name2));// true
	}
}