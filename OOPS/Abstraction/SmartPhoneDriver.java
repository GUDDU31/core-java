/* implementation of Abstract method */
abstract class Phone 
{
  abstract public void camera();
  abstract public void browser();
  abstract public void mp3();
}

abstract class Samsung extends Phone
{
  public void browser()
  {
  	System.out.println("samsung works on 2g browser");
  }
  public void mp3()
  {
  	System.out.println("samsung supports mp3");
  }
}

class S22 extends Samsung
{
	public void camera()
	{
		System.out.println("S22 has 108 camera");
	}
	public void browser()
	{
		System.out.println("S22 works on 5g browser");
	}
	public void mp3()
	{
		System.out.println("S22 supports mp3 and mp4");
	}
}

class SmartPhoneDriver
{
	public static void main(String[] args) 
	{
       Phone p1=new S22();
       p1.browser(); // S22 works on 5g browser
       p1.mp3(); //S22 supports mp3 and mp4
       Samsung s1=(Samsung) p1; // Down casting
       s1.camera(); // S22 has 108 camera
	}
}