package anotherOne;
import java.util.Scanner;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
				System.out.println("enter first number");
				int firstNo = sc.nextInt();

				System.out.println("enter second number");		
				int secondNo = sc.nextInt();

				if(firstNo>secondNo) {
					System.out.println("first is bigger");
				}else{
						System.out.println("second is bigger");
				}
	}
	
}
