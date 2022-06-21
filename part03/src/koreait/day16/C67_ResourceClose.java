package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose {
 public static void main(String[] args) {
	 
	// String filename = "C:\\Iclass05\\자바태스트.txt";
	// String filename = "C:\\Iclass05\\자바태스트.txt2"; file DNE
	// String filename = "C:\\Iclass05\\자바태스트.txt";
	// String filename2 = "C:\\Iclass05\\자바태스트3.txt";
	 
	 String filenme = fileDiallogOpen();
	 String filenme2 = fileDiallogSave();
	 
		
	 File ifile = new File(filenme);
	 File ofile = new File(filenme2);
	 
	try ( 
		 Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)){

		 while(sc.hasNext()) {
			 String temp = sc.nextLine(); //read one line from file 
			 System.out.println(temp);    //def read(console)
			 pw.println(temp);            //file write 
		 }
		 
	 System.out.println("copy file done");}
	 
	 catch (FileNotFoundException e) {
		System.out.println("user err : " + e.getMessage());
		System.out.println("the file does not exist");
		//e.printStackTrace();
	}catch (Exception e) {
		System.out.println("err aside from FNF : " + e.getMessage());
	}
		
	}
 public static String fileDiallogOpen() {
	// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
	// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX 등이 있습니다.
	// Windows OS는 프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.
			
			JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
			FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
			fdr.setVisible(true);		//파일 대화상자 보이기
			
			String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
			File file = new File(filename);
			System.out.println("size : " + file.length() + "bite");
			System.out.println("선택한 경로와 파일 : " + filename);
			System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());
			
			
			FileDialog fdw = new FileDialog(f, "파일 저장",FileDialog.SAVE);
			fdw.setVisible(true);
			System.out.println("저장한 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
			
			return filename;

}
 public static String fileDiallogSave() {
	 JFrame f = new JFrame();
	 FileDialog fdw = new FileDialog(f,"파일 열기",FileDialog.LOAD);	
	 fdw.setVisible(true);	
		String filename = fdw.getDirectory() + fdw.getFile(); 	//선택한 파일의 경로와 파일명 연결
		System.out.println("saved 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
		return filename;
		
		
		
 }
 }

