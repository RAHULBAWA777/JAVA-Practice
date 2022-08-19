package anotherOne;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int no = 7;int temp=0;
//	for(int i = 2;i<=no-1;i++) {
//		if (no%i==0){
//			temp=temp+1;
//		}}
//		if(temp>0) {
//			System.out.println("not prime ");
//		}else {
//			System.out.println("prime");
//
//		
//	}
		int temp=0;
		for (int i=1;i<=100;i++) {
			for (int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if (temp==0) {
				System.out.println(i);
			}else {
				temp=0;
			}
		}
	}
}
