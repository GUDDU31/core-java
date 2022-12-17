/*...  WAJP to create a method & that method should return factors of a arguments*/
class  factors
{
	public static void main(String[] args) 
	{
		int res= fact (6);
		System.out.println("the number of factors are "+res);
	}
	public static int fact(int num)
	{
		int count=0;
		for (int i=1; i<=num; i++)
		{
			if (num%i==0)
		{
			count ++;
		}
	}
	return count;
}
}

