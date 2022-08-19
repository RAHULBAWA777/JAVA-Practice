
package anotherOne;
import java.util.Scanner;
public class ReverseN0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number that you wanna reverse ");
		int no = sc.nextInt();
		int rev = 0;
		int rem;
		while(no!=0) {
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		System.out.println(rev);	
	}

}
