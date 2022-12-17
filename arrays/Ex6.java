/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*WAJP to sort array in assigned order {7,9,11,6,8,13,19,15,4}*/
class Ex6
{
	public static void main(String[] args) 
	{
       int[]arr={7,9,11,6,8,13,19,15,4};

       for(int i=0; i<=arr.length-1; i++)
       {
         for (int j=i+1; j<=arr.length-1; j++ ) 
         {  int temp;
            if (arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
        }
        System.out.println("array after sorting");
       	 for(int k=0; k<=arr.length-1;k++)
       	  {
       	 	System.out.println(arr[k]);
       	  } 
	}
}