package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {
		//switch  문은 if~ else if sub
		int item_no;
		int pay=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("상품목록 : 1. 2200원 2.1900원 3.3600원 4.2870원" );
		System.out.print("상품을 선택 바구니에 넣어주세요");	
		item_no = sc.nextInt();
		
		
		
		
		switch (item_no) {
		case 1:
			pay =2200;
			break;
		case 2:
			pay = 1900;
			break;
		case 3:
			pay = 3600;
			break;
		case 4:
			pay = 2870;
			break;

		default:// case 문 해당없음
			System.out.println("상품선택이 잘못되었습니다");
			break;
		}
		
		System.out.println("결제 금액" + pay + "입니다");
		if (item_no ==1)pay =2200;
		else
			if (item_no ==2) pay= 1900;
			else
				if (item_no ==3) pay =3600;
				else 
					if (item_no ==4) pay = 2870;
					else System.out.println("상품선택을 잘못하셨습니다");pay = 999999;
		
		System.out.println("결제 금액s" + pay + "입니다");

	}

}
//