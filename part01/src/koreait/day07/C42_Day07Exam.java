package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] n1= new int[5];
		int[] n2= new int[5];
		int count=1;
		int ans = 0;
		int cnt=0; 
		
	
		System.out.println("-----------------------------------------");
		System.out.println("빨간펜 수학 2자리 문제 풀기");
		System.out.println("-----------------------------------------");
		System.out.println("시작합니다");
		
		
		for(int i=0;i<n1.length;i++) {
		n1[i] = r.nextInt(91)+10;
	    n2[i] = r.nextInt(91)+10;
			System.out.print("문재" + count++ +"." + n1[i]+"+" +n2[i] +"답입력->" );
			ans=	n1[i]+n2[i];
		int an = sc.nextInt();  
		if(ans == an) {cnt++;}
		
		System.out.println("---------------------------------");
		System.out.println("체점합니다. 맞은갯수" + cnt);
	
		
		if(ans != an) {
		
			
			System.out.print("틀린 문제 정답");
		 System.out.println("문재" + count +"= "+ ans );}
			
		
			
			
			}sc.close();
		}
		
}	
				
			
	
		
		       
		
	
	

