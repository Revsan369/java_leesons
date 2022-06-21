package koreait.day02;

public class C05_IntegerVar {
public static void main(String[] args) {
	/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
	 * 2. 기본형 (primitive) 데이터 타입 : 정수형식
		 * 		byte, short, int, long 키워드(역할이 정해진 단어)
	 */

	byte n1; //byte 형식 data 저장할 공간
	short n2;
	int n3;
	long n4;
	
	byte m1=100;
	short m2=100;
	int m3=100;
	long m4=100;
			
	//System.out.println(n1);//
	System.out.println(m1);
	
	n1=123;//이상황도 4바이트 int리터럴이지만 int범위네에 있기때문에 대입 가능
	//n1=999; // 오류 +127보다 크다 (바꾸는건 가능)
	n2=299;
	n3 =4000;
	//n2=40000;// -32768 보다 작음
	//n3=123456789123; //214748364 보다 큼
	//n4= 123456789123; // 해당 리터럴은 int리터럴임
	n4 = 123456789123L; // long리터럴표시는 L또는 l을 마지막에씀
 //은 long이아니라도 int 리터럴네에서 포시 가능 *int 범위 넘어가면 L붙여서 long의로 표시(casting 컨펌)
		System.out.println("변수 n1" + n1);
		System.out.println("변수 n2" + n2);
		System.out.printf("변수 %s = %d \n", "n3", n3);
		System.out.printf("변수 %s = %d \n", "n4", n4);
}
}
/*변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
 *    변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
 *	    데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여합니다.
 *    변수 선언한다 -> 변수명과 데이터 형식을 지정하는 것.-> 메모리에 공간 할당 됩니다.
 */
