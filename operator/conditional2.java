class conditional2 // operand1 ? operand1 : operand2 
{
	public static void main(String[] args) 
	{
		int a=14;
		int b=7;
		int c=16;
		int result= a>b? a>c? a:c : b<c? b:c;

		System.out.println(result); //16 
	}
}
