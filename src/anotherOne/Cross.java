package anotherOne;

public class Cross {

	public static void main(String[] args) {
		for(int i=0;i<11;i++) {
		for(int j=0;j<11;j++) {
//			System.out.print("*");
			if(i==j || i+j==10) {
				System.out.print("*");
			}else {
				System.out.print(" ");

			}
		}
		System.out.println();

	}

}}
