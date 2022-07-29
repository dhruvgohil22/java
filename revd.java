import java.util.Scanner;

class revd
{
	public static void main(String args[])
	{
			int n=1234,rev = 0, d;
			Scanner sc = new Scanner(System.in);
			System.out.println("enetr your nu,ber: ");
			n = sc.nextInt();
			while(n>0)
			{
				d=n%10;
				rev=rev*10+d;
				n/=10;
			}
			System.out.println("reverse number is "+rev);
	 
	}
}
