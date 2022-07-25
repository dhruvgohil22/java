import java.util.Scanner;
class prime
{
    public static void main(String[]args)
{
    int i,f=0,no;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number= ");
    no=sc.nextInt();
    
    for(i=2;i<no/2;i++)
   {     if(no%i==0){
           f=1;
    }
 }
if(f==1){
  System.out.println("num not prime");}
else
 { System.out.println("num is prime");
}
}
}