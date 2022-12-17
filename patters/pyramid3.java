/* pyramid */
class pyramid3
{
    public static void main(String[] args) 
    {
        for (int i = 1; i<=5; i++) 
        {
        	
            for (int j = 2; j <=i; j++) 
            		{
            			System.out.print(" ");
            		}
            for (int k=i; k<=2*5-i;k++ )
            {	
              System.out.print("*");
            } 

            System.out.println();
        }
        
    }
}