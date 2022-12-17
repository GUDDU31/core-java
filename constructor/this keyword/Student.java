class Student
{
	String name;
	int id;
	long cno;
	static String Schname= "xyz high school" ;
	Student( String name)

	{
		this.name=name;
		    System.out.println("from student (string)");
	}   
	  Student(String name, int id) 
	{
		this(name);
		this.id=id;
		    System.out.println("from student (string,int)");
	}
	Student(String name, int id, long cno)
	{
        this(name, id);
        this.cno=cno;
            System.out.println("from student(string, int, long)");
	}
		public void getAttributes()
		{
			System.out.println("Student name= "+ name);
			System.out.println("Student name= "+ id);
            System.out.println("Student name= "+ cno);
            System.out.println("Student name= "+ Schname);
		}
	     
	public static void main(String[] args) 
	{
		Student s1=new Student("Laila",100,9876543210l);
		s1.getAttributes();
		Student s2=new Student("Mala",200,134567890l);
		s2.getAttributes();
		Student s3=new Student("guddu",300,9876543210l);
		s3.getAttributes();
	}
}