package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	 public static void main(String[] args) {
		
	
	
	Scanner sc = new Scanner(System.in);
	
	String best;
	
	

	int max;
	int english;
	int korean;
	int science;
	
	System.out.println("각과목의 점수를 기입해주세요----------");
	System.out.println("국어");
	korean = sc.nextInt();
	System.out.println("영어");
	english = sc.nextInt();
	System.out.println("과학");
	science = sc.nextInt();
	
	if(korean>english) {max = korean; best = "국어";}
	else { max = english; best = "영어";}
	 if(max<science) {max = science; best = "과학";}
	 
	 if (max == korean) {System.out.println("학생의 특기 과목은 국어입니다" );}
	 if (max == english) {System.out.println("학생의 특기 과목은 영어입니다" );}
	 if (max == science) {System.out.println("학생의 특기 과목은 과학입니다" );}
	 
	 System.out.println("최고점" + max );
	 System.out.println("과목수 3");
	 System.out.println("총점" + (english+korean+science) );
	 System.out.println("평균" + (english*korean*science/3) );
	 System.out.println("특기과목" + best );
	
	
	
	 }
	
}
