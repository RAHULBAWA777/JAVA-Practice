package anotherOne;
import java.util.Scanner;
public class oddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
		int firstNo = sc.nextInt();

		if(firstNo%2==0) {
			System.out.println("even");
		}else{
				System.out.println("odd");
		}
}
	}


