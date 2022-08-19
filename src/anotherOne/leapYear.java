package anotherOne;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter year");
//		int year = sc.nextInt();
//
//		if(year%4==0) {
//			if(year%100==0) {
//				if(year%400==0) {
//					System.out.println("leap year");
//
//				}else {
//					System.out.println("not a leap year");
//
//				}
//				
//			}else {
//				System.out.println(" leap year");
//
//			}
//		}else{
//				System.out.println("not a leap year");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year number");
		int year=sc.nextInt();
		if((year%4==0)||(year%400==0) && (year%100!=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}
}
	}


