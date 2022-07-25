import java.util.Scanner;
class max3
{
	public static void main(String args[])
	{
		int a,b,c,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any three number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();


		max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
		System.out.println(max+" is max.");
		
		/*if(a>b && a>c)
			System.out.println(a+" is max.");
		else if(b>a && b>c)
			System.out.println(b+" is max");
		else
			System.out.println(c+" is max"); */
	}
}