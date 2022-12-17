/*object class is a supermost parent class
for all the classes in java  (overriding hashCode method....comparing based on id)*/
class Book1
{
	String name;
	int id;
	Book1 (String sname, int id)
	{
		this.name=sname;
		this.id=id;
	}
    public int hashCode() //override
    {
    	int a=name.hashCode();
    	int b=id;
    	return a+b;
    }
	public static void main(String[] args) 
	{
	   Book1 b1=new Book1("java", 120);
	   Book1 b2=new Book1("java", 200);
	   System.out.println(b1.hashCode()); //3254938
	   System.out.println(b2.hashCode()); //3254938
	}
}
