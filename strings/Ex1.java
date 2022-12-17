/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (diff. between object creating in string constant area
and heap area with the help of new keyword and directally*/
class Ex1
{
	public static void main(String[] args) 
	{
		String name1=new String("ram");
		String name2=new String("ram"); 
		System.out.println(name1);//ram
		System.out.println(name2);// ram
		System.out.println(name1==name2); // false
		System.out.println(name1.equals(name2));// true
		System.out.println(name1.hashCode());//112670
		System.out.println(name2.hashCode());//112670
	}
}