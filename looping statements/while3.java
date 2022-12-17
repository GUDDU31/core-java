import java.util.Scanner;
class while3
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter starting number");
		int start=s.nextInt();

		System.out.println("enter ending number");
		int end=s.nextInt();

while(start<=end)
{
	if (start%3==0  && start%7==0) {
		System.out.println(start);
	}
start++;
}

	}	
}