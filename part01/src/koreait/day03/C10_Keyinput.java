package koreait.day03;

import java.util.Scanner;

public class C10_Keyinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//키보드 입력을위한 변수선언 // scanner import by ctrl space then java.util
		
		int data;
		
		System.out.println("정수값 입력하세요 ->");//출력 값을 주면 콘솔창이 자동 팝업됌 
		data = sc.nextInt(); //(동적) 입력 받고 
		System.out.println("입력된 값은" + data + "입니다");
		
		double point;
		System.out.println("실수 입력");
		
		point = sc.nextDouble();
		System.out.println("입력된 값은" + point + "입니다");
	}

}
/* 
 * 	표준 출력 : System.out (out-> System class에 정적인 필드)
 *  표준 입력 : System.in   (in ->System class에 정적인 필드)  -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시켜는 기능 사용.
 * 						   -> 기본 패키지의 클래스가  아니므로 import 가 필요합니다.	java.lang은 import 할필효 없음
 * 
 */
