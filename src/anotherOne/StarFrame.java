package anotherOne;

public class StarFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
//				System.out.print("*");
				if(i>=1&&j>=1&& i<=3&&j<=3) {
					System.out.print(" ");
				}else {
					System.out.print("*");

				}
			}
			System.out.println();

		}

	}

}
