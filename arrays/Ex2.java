/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*WAJP to print even no. from an Array {7,9,11,6,8,13,19,15,4}*/
class Ex2
{
	public static void main(String[] args) 
	{
       int[]arr={7,9,11,6,8,13,19,15,4};
       int even=arr[0];

       for(int i=0; i<=arr.length-1; i++)
       {
       	 if(arr[i]%2==0)
       	 {
       	 	System.out.println("This no. is even :"+arr[i]);
       	 }
       }
	}
}