package koreait.day09;

import java.util.Random;

public class MathProblem {
	//인스턴스 필드 : static이아닌형식. 각객체셍성시 다릉값
	private int n1;
	private int n2;
	private char op; //operation
	private boolean isCrrect; //사용자답 맞춘었는지
	//isCorrect 대신 ans 필드 추가헤 사용자 답 저장 가능
	//전적 필드
	public static final int max_size = 20; 
	
	public MathProblem(char op) {
		this.op = op;
	}
	
//참고  
	//static method 는 필드값과 무관하개 동작
	// 인스턴그 메는 인필드값과 여관되어 동작함   
	public void makeProb() { // 사칙연산 종류별로 적절한 난수 생성하기->문제를 만들어 줍니다.

		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':
			max1=99;max2=99;min1=11;min2=11;//n1,n2 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11;//n1 50~99, n2 11~49 (-)답이 나오지 않도록
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11;//n1 11~77, n2 11~29 곱겜을 좀 쉽개
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11;//n1 41~99, n2 11~29 n1>n2 나눗셈이라서
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1;
		n2=r.nextInt(max2-min2+1)+min2;
	}

	public int showAnswer() {		//n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	
	
	public String problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	public boolean isCrrect() {
		return isCrrect;
	}
	public void setCrrect(boolean isCrrect) {
		this.isCrrect = isCrrect;
	}

	public static int getMaxSize() {
		return max_size;
	}

}
