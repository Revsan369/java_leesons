package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
 public static void main(String[] args) {
	Random r = new Random(); // 객체 셍성
	
	System.out.println("1. 정수형 랜덤값 10개 출력");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt();
		System.out.println(inum);
	}
	System.out.println("2. 정수형 랜덤값 10개 출력 - bound");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(100);//0<= 난수 <100
		System.out.println(inum);}//bound 는 양수값만 가능 아니면 수식 사용
	System.out.println("3. 정수형 랜덤값 10개 출력 - bound");
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(100)+1;// 1 <= n <101
		System.out.println(inum);}
	
	System.out.println("4. 2~45 로또 범위 10개");//int inum = r.nextInt(m-n)+n;>>> n=<x<m
	for(int i=0;i<10;i++) {
		int inum = r.nextInt(44)+2;
		System.out.println(inum);
	}
}
 
}
