/*String literal:- Anything which is enclose with double code (" ")
is known as string literal (stringBuffer)*/
class SBReverse
{
	public static void main(String[] args) 
	{
		
		StringBuffer sb1=new StringBuffer("cat");
		rev=sb1;
		for (int i=sb1.length()-1; i>=0 ; i--) 
		{
			rev=rev.append(sb1.charAt(i));
		}
		System.out.println(rev);// tac
	}
}