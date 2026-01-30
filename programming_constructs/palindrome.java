import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		int rem=0;
		for(int i=0;i<=num;i++)
		{rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
		}
		if(rev==num)
		{System.out.println("its palindrome");}
else
{System.out.println("not palindrome");}
	}
}	
			
			