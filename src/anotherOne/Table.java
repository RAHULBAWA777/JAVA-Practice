package anotherOne;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Whose table you want to find");
		int num = sc.nextInt();
		int i;
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}