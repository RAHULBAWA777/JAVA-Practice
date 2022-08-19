package anotherOne;

import java.util.Scanner;

class Bank{
	private double balance=10000;
	private int pwd;
	
//	DEPOSIT
	public void deposit(double money) {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd==123) {
			balance = balance + money;
			System.out.println("Welcome\n"+"Money Added="+money+"\nTotal money="+balance);
		}
		else {
			System.out.println("Incorrect password");
		}
	}
	
//	WITHDRAW
	public void withdraw(double money) {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd==123) {
			balance = balance-money;
			System.out.println("Welcome\n"+"Money withdrawn="+money+"\nTotal money left="+balance);
		}
		else {
			System.out.println("Incorrect password");
		}
	}
	
//	Checkdata
	public void check() {
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		pwd = sc.nextInt();
		if(pwd==123) {
			System.out.println("Welcome\n"+"\nTotal money="+balance);
		}
		else {
			System.out.println("Incorrect password");
		}
	}
	
}

public class bankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		System.out.println("1. Deposit\n 2.Withdraw\n 3.Check Balance");
		System.out.println("Select any one of the Services to continue");
		
		Scanner sc2 = new Scanner(System.in);
		int h=sc2.nextInt();
		
		switch(h) {
		case 1: b.deposit(5000);
		break;
		case 2: b.withdraw(2000);
		break;
		case 3: b.check();
		break;
		default:System.out.println("invalid option");
		}
	}

}
