import java.util.Scanner;
class SpingSeason
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the month and the date");
	int m=sc.nextInt();
	int d=sc.nextInt();
	
	if (m==3&&d>=20&&d<=31)
		System.out.println("its spring");
	else if(m==4&&d>=1&&d<=30)
		System.out.println("its spring");
	else if(m==5&&d>=1&&d<=31)
		System.out.println("its spring");
	else if(m==6&&d>=1&&d<=20)
		System.out.println("its spring");
	else 
		System.out.println("its not spring");
	
		}
	}
		
	