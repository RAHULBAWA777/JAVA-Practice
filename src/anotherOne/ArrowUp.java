package anotherOne;

public class ArrowUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 4; j >=i; j--) {
//				System.out.print(' ');
//			}
//			for (int k = 1; k <(i*2); k++) {
//				if(k>1 && k<(i*2)-1){
//					System.out.print(' ');
//				}else {
//					System.out.print('*');
//				}
//			}
//			System.out.println();
//		}


		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				if(k>1 && k<(i*2)-1) {
					System.out.print(" ");

				}
				else {
					
					System.out.print("*");
				}
				
		}
		System.out.println();

		
//		for (int e = 5; e >=1; e--) {
//			for (int w = 5; w >e; w--) {
//				System.out.print(' ');
//			}
//			for (int q = 1; q<(e*2); q++) {
//				if(q>1 && q<(e*2)-1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			
//			System.out.println();
//		}
		}
	}
		
}
