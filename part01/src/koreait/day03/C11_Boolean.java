package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
 public static void main(String[] args) {
	
	 boolean result;
	 result = 10 > 5;
	 System.out.println("10 > 5 결과" + result);
	 
	 System.out.println("9 != 9결과" + (9!=9));
	 System.out.println("9 == 9결과" + (9==9));
	 
	 System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		// 아래 2 경우 1번쨰값이 거짓이라 2번째는 상관없다
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		//1번쨰 참 then true 2nd is dead code 
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));

	
		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not ture = " + !true);    //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);

	 int korean,math;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("국어점수 입력->");
	 korean = sc.nextInt();
	 
	 System.out.print("수학점수 입력->");
	 math = sc.nextInt();
	 
	 
	 System.out.println("모범학생?" + (korean>=80 && math>=80) );
	 
	 
	 System.out.println("특기학생?" + (korean>=90 || math>=90) );
	 
	 System.out.println("특이학생?" + !(korean>=20 && korean<=80 ) );
	
	 System.out.println("특이학생?" + !(korean<20 || korean>80 ) );
	 

		 
	 
	 //국수덤구 모두 80점 이상인가 
	 // 국또수 50점 이상인가
	 
}
}
//data기본 형식 boolean true or false ex ==,(등등,같다), !=(같지않다), ><,>=, if, for 