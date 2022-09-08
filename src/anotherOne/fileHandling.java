package anotherOne;
import java.io.*;
public class fileHandling {

	public static void main(String[] args) {

//	File f = new File("C:\\Users\\HP\\Desktop\\javaFile.txt");
//	try {
//		if(f.createNewFile()) {
//			System.out.println("File created");
//		}else {
//			System.out.println("File already present");
//		}
//	}
//		catch(IOException e){
//			System.out.println(e);
//		}
	
//	try {
//		FileWriter f = new FileWriter("C:\\Users\\HP\\Desktop\\javaFile.txt");
//		try {
//			f.write("Java a badass language");
//		}
//		finally {
//			f.close();
//		}
//		System.out.println("PRocess Done");
//	}
//	catch(IOException e){
//		System.out.println(e);
//	}
		
		try {
		 FileReader f = new FileReader ("C:\\\\Users\\\\HP\\\\Desktop\\\\javaFile.txt");
				 try {
					 int i;
					 while((i=f.read())!=-1) {
						 System.out.print((char)i);
					 }
				 }
				 finally{f.close();}
		}
			catch(IOException e) {
				System.out.println(e);
		}
	}

}
