/*Arrays is a collection of homogeneous type of data which are store
under a common name*/
/*WAJP to print prime no. from an Array {7,9,11,6,8,13,19,15,4}*/
class Ex5
{
	public static void main(String[] args) 
	{
       int[]arr={7,9,11,6,8,13,19,15,4};

       for(int i=0; i<=arr.length-1; i++)
       {
         int factors=0;
         for (int j=1; j<=arr[i]; j++ ) 
         {
            if (arr[i]%j==0)
            {
                factors++;
            }
         }
    
       	 if(factors==2)
       	  {
       	 	System.out.println(arr[i]);
       	  }
       	}
       
	}
}