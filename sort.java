import java.util.Scanner;

class sort
{
	public static void main(String args[])
	{
		int []a={2,5,3,4,1};
		int t;
		Scanner sc = new Scanner(System.in)
		
		//for(int i=0; i<5; i++)
		//{
		//	a[i] = sc.nextInt()
			
		//}
		for(int i=0; i<5; i++)
		{
			for(int j=1; j<5; j++)
			{
				if(a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Sorted Element : ");
		for(int k=0; k<5; k++)
		{
			System.out.println(" "+a[i]);
		}
	}
}