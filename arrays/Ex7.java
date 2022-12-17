/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*WAJP to remove a duplicate elements from array{7,9,11,6,8,13,19,15,4}*/
class Ex7
{
	public static void main(String[] args) 
	{
       int[]arr={7,9,11,6,8,13,19,15,4};

       for(int i=0; i<=arr.length-1; i++)
       {
         for (int j=i+1; j<=arr.length-1; j++ ) 
         {  
            if (arr[i]==arr[j])
            {
              arr[i]=0;
            }
         }
        }
        System.out.println("after removing duplicates");
       	 for(int k=0; k<=arr.length-1;k++)
       	  {
       	 	System.out.println(arr[k]);
       	  } 
	}
}