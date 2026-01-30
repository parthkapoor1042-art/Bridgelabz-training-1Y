import java.util.Scanner;
class oddeven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{if(i%2==0){
		System.out.println("the even numbers are="+i);}}
		for(int i=1;i<=n;i++){
			if(i%2!=0)
		{System.out.println("the odd numbers are="+i);}}
	}
}
			
		
		
		