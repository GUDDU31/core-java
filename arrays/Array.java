/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
class Array
{
	public static void main(String[] args) 
	{
       int[]a=new int [5]; // Declaration & Initialization
       a[0]=10;
       a[1]=20;
       a[2]=30;// Adding elements into an Array
       a[3]=40;
       a[4]=50;

       System.out.println(a[0]); //10
       System.out.println(a[1]); //20
       System.out.println(a[2]); //30 Accessing elements from an array
       System.out.println(a[3]); //40
       System.out.println(a[4]); //50
       System.out.println(a[5]); //Array index out of Bounds exception bcz
                                 // a[5] does not exist
	}
}