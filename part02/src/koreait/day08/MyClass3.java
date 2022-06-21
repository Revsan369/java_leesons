package koreait.day08;

public class MyClass3 {

	public class getInstance extends MyClass3 {

	}
	private static MyClass3 my = new MyClass3();
	
	private MyClass3() {// 생성자는 private 
		
		}
	public static  MyClass3 getInstance() {
		return my;
	}
	public void test() {
		System.out.println("이렇개 겍체를ㄹ 생성하는 클래스는 객체 1개만 만듬");
		
	}
	public static void staticTest() {
		System.out.println("객체와ㅣ 상관 없는 static");
	}
}
