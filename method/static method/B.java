// case ..Accdssing the static method outside of the  class
class B
{
	public static void main(String[] args) 
	{
		// test(); compile time error.
		A.test(); // Accessing using class name.
		A a1= new A();
		a1.test (); // Accessing with the help of  object refrence..
	}
	
		
}