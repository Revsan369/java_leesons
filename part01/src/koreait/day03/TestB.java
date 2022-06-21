package koreait.day03;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		 
		int korean;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("국어점수 입력->");
		 korean = sc.nextInt();
		 
	
		 
		 
		 boolean i;
		 
		i =! (korean>=20 && korean<=80 );
		 
		
		 System.out.println("특이학생?" + i);
		 sc.close();
	}

}
