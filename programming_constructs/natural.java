import java.util.Scanner;
class natural
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n>=0)
		{System.out.println("n is a natural number");
		int sum=n*(n+1)/2;
		System.out.println("the sum of n natural numbers is=" +sum);}
		else 
	    System.out.println("n is not a natural number");
		}
	}


		
		