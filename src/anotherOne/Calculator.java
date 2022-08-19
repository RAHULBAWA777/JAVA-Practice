package anotherOne;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 =sc.nextInt();
		
		System.out.println("Enter second number");
		int n2 =sc.nextInt();
		
		System.out.println("what operation do you wish to apply :- (+,-,*,/)");
		String op =sc.next();
		
		int result;
		
		switch(op){
		case "+":result=n1+n2;
		System.out.println("the answer is - "+ result);
		break;		
		
		case "-":result=n1-n2;
		System.out.println("the answer is - "+ result);
		break;
		
		case "*":result=n1*n2;
		System.out.println("the answer is - "+ result);
		break;
		
		case "/":result=n1/n2;
		System.out.println("the answer is - " + result);
		break;
		}
		
	}

}
