package koreait.day04;

public class C19_MetodTest {
 public static void main(String[] args) {
	// main - 실행의 시작점 - 정적인 요소
	 System.out.println("deined method trial");
	 System.out.println("메소드 호출");
	 methodA(); // 필요할때 호출
	 System.out.println("1.");
	 methodB(11, 33);
	 methodB(929, 111);
	 System.out.println("2.");
	 methodC(92.9, 1.11);
	 methodC(929, 111);
	 System.out.println("4.");
	methodD();
	 int temp = methodD();
	 System.out.println("return" + temp);
	 System.out.println("5.");
	 methodE(3,5);
	 System.out.println("6.");
	 int temp2 = methodE(3,5);
	 System.out.println("return =" + temp2);
	 
	 
}
 public static void methodA() { 
	 System.out.println("1st method definer practice");
 }
 
 public static void methodB(int a, int b) {
	 System.out.println("2nd method");
	 System.out.println("전달값 " + a + "b=" + b  );
 }
 public static void methodC(double a, double b) {
	 System.out.println("3rd method");
	 System.out.println("전달값 " + a + "b=" + b  );}
 public static int methodD() {
	 System.out.println("##4th metho##");
	 return 999;
	 
 }
 public static int methodE(int a, int b) {
	 System.out.println("## 5thmethod##");
	return a + b;
}{}
}
