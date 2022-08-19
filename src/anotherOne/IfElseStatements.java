package anotherOne;
import java.util.Scanner;
public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		int n=o.nextInt();
		String value ="";
		if(n%2==1||((n%2==0)&&(n>=6 && n<=20))) {
			value="weird";
		}else
		{
			value="not weird";

		}
	System.out.println(value);

	}}
