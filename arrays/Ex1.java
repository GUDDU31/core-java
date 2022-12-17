/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*WAJP to find largest element from an Array {7,9,11,6,8,13,19,15,4}*/
class Ex1
{
	public static void main(String[] args) 
	{
       int[]arr={7,9,11,6,8,13,19,15,4};
       int large=arr[0];

       for(int i=0; i<=arr.length-1; i++)
       {
       	 if(arr[i]>large)
       	 {
       	 	large=arr[i];
       	 }
       }
       System.out.println("largest element is : "+large); //19
	}
}