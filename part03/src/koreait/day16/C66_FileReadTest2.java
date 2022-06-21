package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest2 {
 public static void main(String[] args) {
	 
	 //String filename = "C:\\Iclass05\\자바태스트.txt";
	 String filename = "C:\\Iclass05\\자바태스트2.txt";
	
			 File file = new File(filename);
			 Scanner sc = null;
			 try {
				 sc = new Scanner(file);
//				 System.out.println("Read file : " + sc.nextLine());
//				 System.out.println("Read file : " + sc.nextLine());
//				 System.out.println("Read file : " + sc.nextLine());
//				 System.out.println("Read file : " + sc.nextLine());
				 
				 while(sc.hasNext()) {
					 System.out.println(sc.nextLine());
				 }
			 System.out.println("prit done");
			 
			} catch (FileNotFoundException e) {
				System.out.println("user err : " + e.getLocalizedMessage());
			}finally {
				if(sc!=null)
				sc.close();
			}
	 
}
}