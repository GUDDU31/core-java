/*object class is a supermost parent class
for all the classes in java  ( Equal method....case2)*/
class Book1
{
	String name;
	Book1 (String sname)
	{
		this.name=sname;
	}

	public static void main(String[] args) 
	{
	   Book1 b1=new Book1("java");
	   Book1 b2=new Book1("java");
	   System.out.println(b1.name); //java
	   System.out.println(b2.name); //java
	   System.out.println(b1==b2); //false
	   System.out.println(b1.equals(b2)); //false
	}
}
