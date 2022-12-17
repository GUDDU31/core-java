/*object class is a supermost parent class
for all the classes in java  ( Equal method....case1)*/
class Book
{
	String name;
	Book (String sname)
	{
		this.name=sname;
	}

	public static void main(String[] args) 
	{
	   Book b1=new Book("java");
	   Book b2=b1;
	   System.out.println(b1.name); //java
	   System.out.println(b2.name); //java
	   System.out.println(b1==b2); //true
	   System.out.println(b2.equals(b2)); //true
	}
}
