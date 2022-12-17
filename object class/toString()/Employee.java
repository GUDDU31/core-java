/*object class is a supermost parent class
for all the classes in java  (over riding toString method)*/
class Employee
{
	String name;
	int id;
	Employee (String sname, int eid)
	{
		name=sname;
		id=eid;
	}

	public String toString()
	{
		return "Employee name= "+name+", id= "+id;
	}

	public static void main(String[] args) 
	{
	   Employee e1=new Employee("guddu", 200);
	   System.out.println(e1); // Employee name= guddu, id=200
	}
}
