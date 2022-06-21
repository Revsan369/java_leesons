package koreait.day03;

public class C07_CastingTest2 {
 public static void main(String[] args) {
	
	 //대입문 : 오른쪽값 변수가 어ㅣㄴ쪽변수로 대입 수식에 사용되는 연산은 다음과 같다
	 //   산술연산 +,-,/(나눗셈몫),%(나머지)실수연산만 정수x
	 //관계연산 ==(동등,같다) , =(같지않다),>,<,
	 // 논리연산 &&(and,그리고 ),||(or), !(not)
	 
	 // 정수형식 연산은 int(default)if not applicable ...
	 
	 int a = 9, b = 3; //가능 
	 double c = 10.99; // 
	 
	 int isum;
	 double bsum;
	 
	 isum = a+b;
	 bsum = a+c;
	 
	 System.out.println("a + b =" + isum);
	 System.out.println("a + c =" + bsum);
	 
	// isum = a + c; //(Casting) cannot convert double to int if needed (casting)형변환  실수를 정수로 변환
	 isum = a + (int)c;//이떄 소수점 아래 버림 반올림 하지 않음
	 
	 System.out.println("a + c(int) =" + isum);
	 
	 System.out.println("a/b =" + (a/b));
	 System.out.println("a%b =" + (a%b));
	
	 System.out.printf("%d / %d = %d\n", a,b,a/b);
	 System.out.printf("%d %% %d = %d\n", a,b,a%b); //%는 1개일땐 형식의로 인식해서 2번써야함
	
	 // 강제형변환(강제casting ) 에시 정/정을 실수로 구하는 처리조건일때 int/int==> int/double
	 
	 //System.out.printf("%d / %d = %s\n", a, b, (double)a / b);//()에 변환 //실수 형식 문자열은 %f %s는 문자열 
	 System.out.printf("%d / %d = %f\n", a, b, (double)a / b);//()에 변환 //실수 형식 문자열은 %f %s는 문자열 
	 System.out.printf("%d / %d = %.2f\n", a, b, (double)a / b);//%.n 은 소숫점 수 // 기본%f일땐 6개 but 0이기때문에 의미는 없음
	 //System.out.printf("%d / %d = %d\n", a, b, (double)a / b);//오류 %d는 정수 이기때문애
	 
	 double test =12.3456789123456;
	  System.out.println("test =" + test);
	  System.out.printf("test = %f\n", test);
	  System.out.printf("test = %.15f\n", test);
	 
	 
	 
			 
}
}
