package ishu;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int average=s.nextInt();
		char grade;
		System.out.println("enter a a verage marks");
		if (average<=80)
		{
			grade='A';
		}
		else if (average<=70 && average>60)
		{
			grade ='B';
		}
		else if (average<=50 && average>40)
		{
			grade = 'c';
		}
		else
		{
			grade = 'D';
		}
		switch(grade)
		{
		case 'A':
			System.out.println("excellent");
			break;
		case 'B':
			System.out.println("well done");
			break;
		case 'C':
			System.out.println("u r pass");
			break;
		case 'D':
			System.out.println("u r fail");
			break;
default:
	System.out.println("Invaild grade");
	}
	System.out.println("Your garde"+grade);
	}
}
		
			