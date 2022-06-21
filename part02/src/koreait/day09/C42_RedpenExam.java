package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedpenExam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int size=5;
	int[] x1 = new int[10];
	int[] x2 = new int[10];
	int[] no = new int[10];
	int n1,n2,ans;
	int cnt=0;
	System.out.println("--------------------------------");
	System.out.println("2자릿수 문제");
	System.out.println("--------------------------------");
	System.out.println("시작");
	for(int i =0;i<size;i++) {
		n1= r.nextInt(89)+11;
		n2= r.nextInt(89)+11;
		System.out.print("문재" + (i+1) +"." + n1 + "+" + n2+ "= >>>");
		ans = sc.nextInt();
		if(ans != n1+n2){
		x1[cnt]=n1;	
		x2[cnt]=n2;	
		no[cnt]=i+1;
		cnt++;
		}
	}
	System.out.println("-------------------------------------");
	System.out.println("맞은겟수 " + (size-cnt) + "(" + ((size-cnt)*100/size)+ "점" );
	System.out.println("::::::::틀린문제 정답 보기:::::::::::::::");
	for(int  i=0;i<cnt;i++)
		System.out.println("문제" +no[i]+ ". " + x1[i] + ". " + x2[i] +"= " +(x1[i]+x2[i]));
	sc.close();
}
}
