/* it is a design process of hiding the emplementation
and by showing only functionalities (method declaration) */
abstract class Parent 
{
  abstract public void m1();
  public void m2()
  {
  	System.out.println("from m2() of parent class");
  }

  public static void main(String[] args) 
  {
  	System.out.println("from main() of parent class");
  }
}

class Child extends Parent
{
	public void m1()
	{
		System.out.println("from m1() of child class");
	}
}

class Driver
{
	public static void main(String[] args) 
	{
		//Parent p2=new Parent(); //CTE (Abstract class can,t be instantitiated)
		Child ch1=new Child();
		ch1.m1(); // from m1() of child class
		ch1.m2(); // from m2() of parent class
		Parent p1=ch1; // Creating reference variable for abstraction
		p1.m1(); // from m1() of child class
	}
}