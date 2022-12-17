/*object class is a supermost parent class
for all the classes in java  (overriding Equal method....comparing based on id)*/
class Book4
{
	String name;
	int id;
	Book4 (String sname, int id)
	{
		this.name=sname;
		this.id=id;
	}
    public boolean equals(Object o)
    {
    	Book4 b=(Book4)o;
    	return this.id==b.id; // comparing based on id;
    }
	public static void main(String[] args) 
	{
	   Book4 b1=new Book4("java", 120);
	   Book4 b2=new Book4("java", 200);
	   System.out.println(b1.name); //java
	   System.out.println(b2.name); //java
	   System.out.println(b1==b2); //false
	   System.out.println(b1.equals(b2)); //true
	}
}
