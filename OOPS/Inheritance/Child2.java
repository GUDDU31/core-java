class Parent2
{
	int a;
	int b;
	Parent2(int var1, int var2)
	{
		System.out.println("from parent1 (int,int) constructor");
		this.a= var1;
		this.b= var2;
	}
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class Child2 extends Parent2
{
   int c;
   Child2(int var1, int var2, int var3)
   {
   	super(var1, var2);
   	this.c=var3;
   	System.out.println("from child2 (int, int, int)");
   }

	{
		System.out.println("from MLNSI of child2 class");
	}

	public static void main(String[] args) 
	{
		Child2 ch2=new Child2(1,2,3);
		System.out.println(ch2.a);
		System.out.println(ch2.b); 
		System.out.println(ch2.c);
	}
}