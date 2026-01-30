import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{int sum=0,sumf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of natural numbers");
		int n=sc.nextInt();
		while(n!=0)
		{
		sum+=n;
		n--;
		}
		 sumf=n*(n+1)/2;
		if(sum==sumf)
		{System.out.println("the ans is same");}
		else
		{System.out.println("the ans is not same");}
	}
}	
			
		