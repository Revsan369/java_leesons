package koreait.day08b;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int[] triallst = new int[10];
	String trailstr;
	int max = 10;
	
	System.out.println("숫자 맞추기 게임 숫자 결정했습니다");
	System.out.println("너 휴먼은 맞춰보세요(101 ~ 299)");
	int numComputrer = r.nextInt(199) +101;
	int numHuman;
	int i =0;
	do {System.out.print("숫자입력 ( 기회" +(max-i)+ ")->");
	numHuman = sc.nextInt();
	if (numHuman < numHuman) {
		triallst[i] = numHuman;
		i++;
		System.out.println("아닙니다 더큰 값입니다");}
		else if(numHuman > numHuman) {
			triallst[i] = numHuman;
			System.out.println("아닙니다 더작은 값입니다");}
			
	if (i==max) { break;
	
	}while(numComputrer != numHuman);
	if (i==max) {
	
				System.out.println("휴먼 입력내용 :" + Arrays.toString(triallst));
				System.out.println("기회 다쓰셨급니다");}
				
			else 
				System.out.println("밎췄습니다.성공ㄲ지 시도 횟수" + (i+1));
		
	}while(sc.nextInt()==0);
	
	System.out.println(";;;;;;game score;;;;;;;");
	
	System.out.println(";;;;;;;the end;;;;;;;;");
	sc.close();
}
}
