package koreait.day02;
// java 에서는 class와 파일명 동일
public class C08_Keyinputtest {
public static void main(String[] args) {
	
	 System.out.println("사각도형");
	 int width = 23;
	 int height = 19;
	 int box_area = width*height;
	 System.out.println("가로:" + width + "cm");
	 System.out.println("세로:" + height + "cm");
	 System.out.println("넓이:" + box_area + "cm^2");
	 
	 
	 System.out.println("==========================");
	 
	 System.out.println("원도형 구하기-----------------------");
	 final double PI = 3.14;
	 double diameter = 23.230;
	 double round = 2* PI * diameter;
	 double area = PI * diameter * diameter ;
	 
	System.out.printf("반지름 : %.3fcmn", diameter );
	System.out.printf("반지름 : %.3fcmWn", round );
	System.out.printf("반지름 : %.3fcmWn", area);
	
	
	// System.out.printf("%d * %d * %d = %f\n",p,c,t, t * p * c);
	// System.out.printf("%d * %d  * %d = %f\n",p,c,t, p * c*c);
}
}
