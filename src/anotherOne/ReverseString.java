package anotherOne;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			
		String name = "RAHUL";
		int len=name.length();
		String reverse="";
		for(int i=len-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}

}
