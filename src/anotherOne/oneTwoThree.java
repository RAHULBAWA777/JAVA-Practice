package anotherOne;

public class oneTwoThree {

	public static void main(String[] args) {
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
System.out.print(j);
	}
	System.out.println();
}
//******************************************
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
System.out.print(i);
	}
	System.out.println();

}
//*******************************************
int count=0;
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		count=count+1;
System.out.print(count);
	}
	System.out.println();
}
//*******************************************
for(int i=1;i<=5;i++) {
	for(int j=i;j>=1;j--) {
System.out.print(j);
	}
	System.out.println();

}
//*******************************************
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
System.out.print(j);
	}
	for(int k=i-1;k>=1;k--) {
		System.out.print(k);
	}
	System.out.println();
}
//********************************************
for(int i=1;i<=5;i++) {
	for(int j=5;j>=i;j--) {
System.out.print(j);
	}
	System.out.println();
}
//********************************************
for(int i=1;i<=5;i++) {
	int no=i;    
	for(int j=1;j<=i;j++) {
		System.out.print(no);
		no=no+5-j;
	}
	System.out.println();
}
//********************************************
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
System.out.print(j);
	}
	System.out.println();
}
	}

}
