import java.util.Scanner;

class fact
{
	public static void main(String args[])
	{
		int a=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr your number: ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			a = a*i;
			
			
		}
		System.out.print("your factorial is "+a);
	}
}	



	