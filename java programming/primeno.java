import java.util. Scanner;
class  primeno
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Nunber");
        int num=sc.nextInt();
        boolean b= false;
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                b=true;
                break;
            }
        }
        if(!b)
        
            System.out.println(num+" is a prime number");
        
        else
        
            System.out.println(num+" is not a prime number");
        
    }
}