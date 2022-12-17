/*object class is a supermost parent class
for all the classes in java  ( hashCode method....)*/
class Book
{
	String name;
	int id;
	Book (String sname, int id)
	{
		this.name=sname;
		this.id=id;
	}
    
	public static void main(String[] args) 
	{
	   Book1 b1=new Book1("java", 120);
	   Book1 b2=new Book1("java", 200);
	   System.out.println(b1.hashCode()); //
	   System.out.println(b2.hashCode()); //
	}
}
