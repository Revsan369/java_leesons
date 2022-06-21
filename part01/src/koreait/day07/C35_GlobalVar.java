package koreait.day07;



public class C35_GlobalVar {
	//local var method for if while 등등{} 에서 선언된변수. 벗어나면 변수사용 못함
	//global var Class{}에서 선언 >>> 선언 위치로 구분
	//Class.변수 (이때 변수는 정적변수)
	//객채를 만들어 사용하는 this.변수명(인스턴스 변수)
	//전역변수는 클래스 또는 객체릐 득성을 나타넬때 필드(.field property) 
	static int num;
	String message;
	int count;
	static double point;
	static final int TEST = 9999;// 상수 초기화안하면 오류
	//상수 test
	
	
	
	public static void main(String[] args) {// static 은 static 만 접근
		int num =10;
		System.out.println("num = " + num);
		methodB();
		//methodA(); //static 
		
		//System.out.println("message = " + message);// static 이 아닌변수 사용불가
		
		}
	
		
	public void methodA() {
		int num = 99;
		System.out.println("num = " + num);
		System.out.println("message = " + message);
	}

	public static void methodB() {
		int num = 77;
		System.out.println("num = " + num);
		System.out.println("num = " + C35_GlobalVar.num);//Integer.BYTES 와 같은 형태
		//전역변수로 선언된 num.  Static 일때는 클래스이름.변수명 / staticdl 이 아니면 this.변수
		
		
		}
	public void methodC(int count) {
		this.count=count;
}
	
}
