/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (reverse)*/
class Reverse
{
	public static void main(String[] args) 
	{
		String s="hello";
		String rev=" ";
		for (int i= s.length()-1; i>=0; i-- ) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);// olleh
	}
}