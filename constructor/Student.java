class Student
{
	String name;
	int id;
	long cno;
	static String Schname= "xyz high school" ;
	Student( String sname, int sid, long scno)

	{
		name= sname;
		id = sid;
		cno= scno;
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