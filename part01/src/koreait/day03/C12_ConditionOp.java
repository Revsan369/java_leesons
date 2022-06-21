package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		
		 int korean,math;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("국어점수 입력->");
		 korean = sc.nextInt();
		 
		 System.out.print("수학점수 입력->");
		 math = sc.nextInt();
		 
		 
		 //System.out.println("모범학생?" + ((korean>=80 && math>=80)? "맞습니다": "아닙니다") );
		 
		 if((korean>=80 && math>=80)){
			 System.out.print("맞습니다");
			 
		 }else { System.out.print("아닙니다");}
		 
		 if(korean<=20 && korean>=80) {System.out.println("특이학생입니다");}
		 else {}
		 
		// TODO Auto-generated method stub

	}

}
