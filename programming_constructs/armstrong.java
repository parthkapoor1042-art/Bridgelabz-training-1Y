import java.util.Scanner;
class armstrong
{
	public static void main(String args[])
	{ Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int rem=0;
	int result=0;
	int org_num=n;
	while(n!=0)
	{rem=n%10;
	result+=rem*rem*rem;
	n=n/10;
	}
	if(result==org_num)
		System.out.println("its armstrong");
	else
		System.out.println("not armstrong");
	}
}