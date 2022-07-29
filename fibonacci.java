import java.util.Scanner;

class fibonacci
{
	public static void main(String args[])
	{

			int n,n1,a=0,b=1,c=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("enetr your number: ");
			n = sc.nextInt();
			for(int i=1; i<=n; i++)
			{
				
				c = a+b;
				System.out.print(" "+a);
				a = b;
				b = c;
				
			}
			
	
	}
}