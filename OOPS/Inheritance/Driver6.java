// down casting
class Parent6
{
	int a=10;
}

class Child6 extends Parent6
{
	int b=20;
}

class Driver6
{
	public static void main(String[] args) 
	{
		Parent6 p1=new Child6(); //up casting
		Child6 ch1= (Child6) p1; // down castingh
		System.out.println(ch1.a); //10
		System.out.println(ch1.b); //20
	}
}