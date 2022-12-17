/*object class is a supermost parent class
for all the classes in java  (overriding Equal method....case2)*/
class Book3
{
	String name;
	Book3 (String sname)
	{
		this.name=sname;
	}
    public boolean equals(Object o)
    {
    	Book3 b=(Book3)o;
    	return name.equals(b.name);
    }
	public static void main(String[] args) 
	{
	   Book3 b1=new Book3("java");
	   Book3 b2=new Book3("java");
	   System.out.println(b1.name); //java
	   System.out.println(b2.name); //java
	   System.out.println(b1==b2); //false
	   System.out.println(b1.equals(b2)); //true
	}
}
