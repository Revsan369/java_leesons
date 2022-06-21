package koreait.day06;

import java.util.Arrays;

public class C29_CharArray {
public static void main(String[] args) {
	
	char[] carr1 = {'i','a','m',' ','j','a','v','a'};
	char[] carr2 = new char[20];
	System.out.println("[[[[char 배열 테스트 -1 ]]]]");
	System.out.println("carr1 : " + Arrays.toString(carr1));
	System.out.println("carr2 : " + Arrays.toString(carr2));//0= 빈칸 
	System.out.println("carr1 배열크기 : " + carr1.length);
	System.out.println("carr2 배열크기 : " + carr2.length);
	
	System.out.println("carr1 3번쨰 데이터값(문자)" + carr1[2]); 
	System.out.println("carr2 3번쨰 데이터값(문자)" + carr2[2]);//0= 빈칸
	
	System.out.println("carr1 3번쨰 데이터값(문자)" + (int)carr1[2]); 
	System.out.println("carr2 3번쨰 데이터값(문자)" + (int)carr2[2]);//0= 기본 초기값
	
    
	System.out.println("\n[[[[char qoduf 2");
	System.out.println("1. for문의로 출력");
	for(int i=0;i<carr1.length;i++) {
	System.out.println(carr1[i]);}
	
	System.out.println("\n2. for");
	for(int i=0;i<carr1.length;i++) {
		System.out.println(carr1[i]);
	}
	System.out.println("\n3. ");
	System.out.println(carr1);
	
	String msg = "I am java";
	System.out.println(msg);
	
	carr2 = "hello hi goodbye".toCharArray();
	System.out.println(carr2);
	System.out.println(carr2[2]);
	System.out.println("carr2.length : " + carr2.length);//16
	
	carr2 = "hello hi goodbye hi goodbye".toCharArray();// 선언배열보다큼
	System.out.println("carr2.length : " + carr2.length);//27 배열크기 확장
	
	String temp  = String.valueOf(carr2); //char[] 배열을 문자열러 변환 String.toCharArray()와 동일
	
	System.out.println("String.valueOf(carr2) : " +String.copyValueOf(carr2));
	System.out.println("String.valueOf(carr2) : " + temp);
}
}
