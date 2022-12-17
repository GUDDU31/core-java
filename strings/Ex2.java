/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (method of string class)*/
class Ex2
{
	public static void main(String[] args) 
	{
		String s1=new String("hello");
		String s2="hello";
		String s3="laila";
		String s4=new String("laila");
		String s5=s4;
		String s6=s2;
		String s7=new String ("laila"); 
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));// true
		System.out.println(s3==s4); // false
		System.out.println(s3.equals(s4));// true
		System.out.println(s2==s6);//true
		System.out.println(s2.equals(s6));//true
		System.out.println(s7==s3);//false
		System.out.println(s7.equals(s3));//true
	}
}