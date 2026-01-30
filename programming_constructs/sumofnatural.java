import java.util.Scanner;
class Sumnatural
{
	public static void main(String args[])
	{int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of natural numbers");
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			 sum=sum+n/2;
		}
		System.out.println("the sum of natural numbers is="+sum);
	}
}
		
		
			