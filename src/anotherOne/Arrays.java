package anotherOne;

import java.util.Iterator;

//important points 
//DECLARATION -> int [] a;
//CREATION -> a = new int[3]
//INITIALIZATION -> int [] a = new int [2]

//DELARATION AND CREATION IN ONE LINE -> int [] a = new int [3]
//DEC, CREATE, INIT IN ONE LINE -> int [] a = {1,2,3}


public class Arrays {
public static void main(String[] args) {
//	int [][][] a = {{{1,2,3},{4,5},{6,7,8}}};
//	System.out.println(a[0][1][0]);
//	System.out.println(a[0].length);
//	
//	for(int i=0;i<a.length;i++) {
//		for(int j=0;j<a[i].length;j++) {
//			for(int k=0;k<a[i][j].length;k++) {
//				System.out.println(a[i][j][k]);
//			}
//		}
//	}
	
	
//	ANONYMOUS ARRAY -> new int {2,3}                always created in single line 
Arrays.sum(new int[] {10,20});
}
static void sum(int[] no) {
	int total = 0;
	for(int i:no) {
		total =total+i;
	}
	System.out.println(total);
}
}
