package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//Exception command v2
public class C68_FileReadWriteTest {
	//main method Throws Exception to jvm prinstacktrace
 public static void main(String[] args) { 
	 
	 String filename = "C:\\vhy\\자바태스트.txt";
	 try {
		fileWrite2(filename);
	} catch (FileNotFoundException e) {
		System.out.println("File not found ");
		e.printStackTrace();
	}
	 fileWrite(filename);
	 //filename = "";
	 try {
		fileRead(filename);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public static void fileWrite(String filename)
 {
			 File file = new File(filename);
			 PrintWriter pw = null;
			 try {
				 pw = new PrintWriter(file);
				 pw.println("모모 90 89 82"); 
				 pw.println("다현 90 89 82"); 
				 pw.println("나연 90 89 82"); 
			 System.out.println("prit done");
			 
			} catch (FileNotFoundException e) {
				System.out.println("user err : " + e.getLocalizedMessage());
			}finally {
				
				pw.close();
			}
	 }
 //throws - can implement multiple err
 public static void fileWrite2(String filename) throws FileNotFoundException
 {
			 File file = new File(filename);
			 PrintWriter pw = null;
			
				 pw = new PrintWriter(file);
				 pw.println("모모 90 89 82"); 
				 pw.println("다현 90 89 82"); 
				 pw.println("나연 90 89 82"); 
			 System.out.println("prit done");
			   pw.close();
			}
   	public static void fileRead(String filename) throws FileNotFoundException {
   		
   		File file = new File(filename);
   		Scanner sc = new Scanner(file);
   			while(sc.hasNext());
   			
   			sc.close();
   	}
   	

}