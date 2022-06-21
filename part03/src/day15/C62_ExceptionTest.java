package day15;

import java.util.Scanner;

public class C62_ExceptionTest {
	
	public static void main(String[] args) {
	
		
		
		
		
		//Exception 예시3
				Scanner sc = new Scanner(System.in);
				System.out.println(">>> ");
				//int a = sc.nextInt();
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("print  : " + a);//숫자 외의 문자 입력시  java.util.InputMismatchException
				//키보드입력을 정수로 변환해서 변수에 저장합니다.

		
		
		
		//Exception 예시2
				int[] nums = new int[5];		//배열선언 : 요소 5개입니다.
				nums[5] =100;
				
	   //Exception 예시1
		String message = null; //java.lang.NullPointerException
		char temp = message.charAt(0);   // java.lang.ArrayIndexOutOfBoundsException: ([5]) is upto [4] start with [0]  
				//message 문자열에서 첫번째(0) 글자 1개 가져옵니다.

		int cnt = message.length();
	}
	


}
/*
Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
     -> 원인에 따라 다른이름 XXXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.
     -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다. 
         따라서, Exception 을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
*/
