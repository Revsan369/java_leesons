package koreait.day03;

import java.util.Scanner;

public class MinMAx {
public static void main(String[] args) {
	int n1;
	int n2;
	int n3;
	
	int min;
	int max;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("n1>>>");
	n1 = sc.nextInt();
	System.out.print("n2>>>");
	n2 = sc.nextInt();
	System.out.print("n3>>>");
	n3 = sc.nextInt();
	System.out.printf("n1=%d\t n2=%d\t ne=%d\n", n1,n2,n3);
	
	if(n1>n2) {max = n1; min =n2;}
	else { max = n2; min = n1;}
	 if(max<n3) {max = n3;} else {min = n3;}
	 
	 System.out.println("max =" + max + "min =" + min);
}
}
