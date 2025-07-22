package ishu;

import java.util.Scanner;

public class largest3
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		int a,b,c,big,temp;
		System.out.println("enter the first number:");
		a=S.nextInt();
		System.out.println("enter the second number:");
		b=S.nextInt();
		System.out.println("enter the third number:");
		c=S.nextInt();
		temp=a>b?a:b;
		big=c>temp?c:temp;
		System.out.println("largest of three numbers="+big);
		}
}
		