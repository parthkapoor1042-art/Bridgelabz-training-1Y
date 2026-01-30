import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int v=sc.nextInt();
		if(v>=18)
		{System.out.println("the person can vote");}
		else
			System.out.println("the person cannot vote");
		}
	}
		