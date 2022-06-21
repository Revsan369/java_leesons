package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {
public static void main(String[] args) {
	//if(){...} else if {}.....else/if
	
	Scanner sc = new Scanner(System.in);
	int money;
	int pay;
	double rate;
	System.out.print("구매 금액은");
	pay = sc.nextInt();
	
	if(pay >=100000) 
		rate = 0.1;
	else if(pay >=70000)
		rate = 0.09;
	if(pay >=40000)
		rate = 0.07;
	else rate = 0.03;
	
	money = (int)(pay * rate);
	System.out.printf("고객님! 오늘 그매하신 금액의 적립금은 %d원 입니다.\n",money);
	System.out.printf("이벤트 기간 적립율 %d %% 적용되었습니다",(int)(rate*100));
	
	sc.close();
		
	}}
	
	
	


