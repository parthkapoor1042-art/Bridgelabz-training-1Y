import java.util.Scanner;
class Bonus
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary");
int sal=sc.nextInt();
System.out.println("enter year of service");
int service=sc.nextInt();
if(service>5)
{int newsal=sal+(sal*5/100);
System.out.println("the salary with bonus is="+newsal);}
else 
{System.out.println("no bomus");}
}
}
