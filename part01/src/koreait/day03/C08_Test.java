package koreait.day03;

import java.util.Scanner;

// java 에서는 class와 파일명 동일
public class C08_Test {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	 System.out.println("사각도형");
	 int width;
	 int height;
	 int ciclearea;
	 int squarearea;
	 final double PI =3.14;
	 double diameter,round,circle_area;
	 
	 System.out.print("");
	 width = sc.nextInt();
	 
	 System.out.print("");
	 height = sc.nextInt();
	 
	 squarearea = width * height;
	 
	 System.out.println("height =" + "width =");
	 System.out.println("사각도형의 넓이는 =" + squarearea + "입니다"  );
//	 int width =  ;
//	 int height = ;
//	 int box_area = width*height;

	 
	 System.out.println("==========================");
	 
	 System.out.println("원도형 구하기-----------------------");

	 // : ++, --, +=, -=, *=,/=
	 sc.close();
	 
}
}
