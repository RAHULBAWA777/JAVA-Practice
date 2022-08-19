package anotherOne;

public class FibonacciRecursion {

	static int b =1, a=0,  c;
	public static void main(String[] args) {
		System.out.print(a+"\n"+b);
		FibonacciRecursion obj = new FibonacciRecursion();
		obj.fib(10);
	}
	void fib(int i)
	{
		if(i>=1) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			fib(i-1);
		}
	}
}
