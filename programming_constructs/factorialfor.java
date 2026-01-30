import java.util.Scanner;
class Factorialfor
{
	public static void main(String srgs[])
	{long factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=n;
	if(n<0){
	System.out.println("not defined");}
	else
	for(i=1;i<=n;i++){
		factorial*=i;
	}
	System.out.println("the factorial of number is="+factorial);
	}
}