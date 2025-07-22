package ishu;

public class fibonacci {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib;
		fib = fib1+fib2;
		System.out.println("fibonacci Series is:");
		System.out.println(fib1);
		System.out.println(fib2);
		while (fib<=50)
		{
			System.out.println(fib);
			fib1=fib2;
			fib2=fib;
			fib=fib+fib2;
		}
	}

}
