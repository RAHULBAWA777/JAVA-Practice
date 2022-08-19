package anotherOne;

public class Factorial {
static  int facts=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		Factorial f = new Factorial();
		f.fact(num);
		System.out.println("factorial is "+facts);
		
	}
//		BY RECURSION
		
		
		 void fact(int num) {
			if (num>=1) {
				facts=facts*num;
				fact(num-1);
			}
		}

}




//int num =5;
//int fact=1;
//
//for(int i=1;i<=num;i++) {
//	 fact=fact*i;	
//}
//System.out.println(fact);