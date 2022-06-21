package koreait.day05;
import java.util.Scanner;

public class C25_WhileTesr {
public static void main(String[] args) {
	for (int i=0;i<5;i++)
		System.out.println("hello!("+(i)+") ");
	
	int j=0;
	int sum = 0;
	
	while(j<5) {
		System.out.println("hello!("+(j)+") ");
		j++;
	}
	int k=0;
	Scanner sc = new Scanner(System.in);
	
	while(k!=-1) {
		System.out.print("정수 입력 >>>");
		k=sc.nextInt();
		if(k!=-1)
		sum += k;
	}
	
	System.out.println("sum = " +sum);
	
	sum=0;
	System.out.print("ver2");
	
	do {
		System.out.print("정수 입력>>>");
		k=sc.nextInt();
	}while(k!=-1);
	System.out.println("sum" + sum);
	
	
	
	sum =0;
	System.out.println("ver3");
	
	while (true) {
		System.out.print("정수 입력 >>>");
		k=sc.nextInt();
		
		if(k==-1) break;// 항상참이면 탈출과 break 문 
		if(k==-1) break;
		if(k%10==0) continue;
		sum+=k;
		
		sum =0;
		System.out.println("ver4");
		boolean isState = true;
		while(isState) {
			System.out.print("정수 입력 >>>");
			k=sc.nextInt();
			
			if(k==-1) isState=false;
			else sum+=k;
			
		}
		System.out.println("sum = " + sum);
		sc.close();
	}
}
}
