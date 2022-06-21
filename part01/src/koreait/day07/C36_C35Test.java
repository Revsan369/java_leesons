package koreait.day07;


public class C36_C35Test {
public static void main(String[] args) {
	//test1 test2 참조변수
	C35_GlobalVar test1 = new C35_GlobalVar();
	C35_GlobalVar test2 = new C35_GlobalVar();
	//C35class 에서  static 
	test1.count =10;
	test2.count =20;
	
	test1.message ="hi test1";
	test2.message = "hello test2";
	
	test1.methodA();// 인스턴스 메소드
	test2.methodA();
	
	test1.methodC(123); //this.count에서 this sms test1
	test2.methodC(999); //
	
	System.out.println("test1.count = " + test1.count);
	System.out.println("test2.count = " + test2.count);
	
	//static 요소 테스트 static 변수똔ㄴ 메소드 는 클래스 이름의로 사용
	
		C35_GlobalVar.num=101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);
		System.out.println("static num = " + test2.num);
		
		System.out.println("TEST = " + C35_GlobalVar.TEST);
		
		C35_GlobalVar test3 = new C35_GlobalVar();
		System.out.println("test3.count= " + test3.count);
		System.out.println("test3.message= " + test3.message);
		System.out.println("C35_GlobalVar.point= " + C35_GlobalVar.point);
		
	//static이 저장되는 메모리 영역(메소드) 겍체는(힙)
}
}
