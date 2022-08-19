package anotherOne;

import java.util.Iterator;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=1;
//		int t1 = num;
//		int length=0;
//		while(t1!=0) {
//			length=length+1;
//			t1=t1/10;
//		}
//		int t2 =num;
//		int rem;
//		int arm=0;
//		while(t2!=0){
//			int mul=1;
//			rem=t2%10;
//			for(int i=1;i<=length;i++);{
//				mul=mul*rem;
//			}
//			arm=arm+mul;
//			t2=t2/10;
//		}
//		if(arm==num) {
//			System.out.println("armstrong num");
//		}else {
//			System.out.println(" not a armstrong num");
//		}
//		
		int num =153;
		int temp=num;
		int pow=0;
		while(temp!=0) {
			pow=pow+1;
			temp=temp/10;
		}
		int temp2=num;
		int rem;
		int arm=0;
		while(temp2!=0) {
			int mul=1;
			rem=temp2%10;
			for (int i = 1; i <= pow; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if (arm==num) {
			System.out.println("number"+num+"is an armstrong number");
		} else {
			System.out.println("number"+num+"is not an armstrong number");
		}
	} 

}
