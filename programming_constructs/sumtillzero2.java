import java.util.Scanner;
class sumtillzero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double n=sc.nextDouble();
		double total=0.0;
		while(n!=0)
		{total+=n;
		System.out.println("enter the number again");
		n=sc.nextDouble();}
		System.out.println("the sum of numbers is="+total);
	}
}
		
		
		
		
		