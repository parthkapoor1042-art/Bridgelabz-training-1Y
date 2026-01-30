import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>b&&a>c)
		{System.out.println("a is the largest number");}
		else
		{System.out.println("a not the largest");}
	}
}

