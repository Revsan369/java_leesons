package koreait.day02;

public class C09_Character {
public static void main(String[] args) {
 
	char c1 ='a'; //char은 정수값 또는 '1레터'
	char c2 = 97;// char= number char = 'a'
	
	System.out.println("c1 =" + c1);
	System.out.println("c2 =" + c2);
	
	//System.out.printf("c1= %d\n",c1 ); // char 형은 %d 불가
	
	System.out.printf("c1= %d\n",(int)c1);
	System.out.printf("c1= %d\n",(int)c2);// 둘다 97 출력
	
	c1 = (char)(c1 + 1);
	System.out.println("c1 =" + c1); // next char
	
	c1++;  //++ 연산은 c1 = c1+1

	System.out.println("c1 =" + c1); //auto casting
	
	char h1 = '가';
	char h2 = 44032;
	char h3 = '\uac00'; // \\u는 16진수유니코드

	System.out.println("h1 =" + h1);
	System.out.println("h2 =" + h2);
	System.out.println("h3 =" + h3);
	
	System.out.printf("h1= %d\n",(int)h1);
	System.out.printf("h2= %d\n",(int)h2);
	System.out.printf("h3= %d\n",(int)h3);
	
	h1++;

	System.out.println("h1 =" + h1);
	
	h1++;
	System.out.println("h1 =" + h1);
	//한글 마지막 문자
	char h4 = 55203;
	char h5 ='\ud7a3';
	System.out.println("h4 =" + h4);
	System.out.println("h5 =" + h5);
	
	h4++;
	System.out.println("h4 =" + h4); //문자없어서 (?) 
	
	h5--;
	System.out.println("h5 =" + h5);
	System.out.println('H' + 'e'+ 'l'+ 'l' + 'o'); // 배열로 처리하지않아 각 문자 코드값을 더한값 문자열로 만드려면 배열로 처리해야함
	
	
	//char이 모여서 한줄로 날열하면 -> 문자열 (class를 가지고 다뤄야함) ex "hello" = 'h','e','l','l','o'
	

}
}
/* 데이터  기본 형식 : 문자형 char
 * * 문자데이터를 정하는 2바이트 형식. 정수값 0~ 65535 범위 저장도 가능
 *   컴푸터에서 다루는 문자코드로 처리되는대 코드는 정수값
 *   문자 데이턴는 '' 기호사용
 *   
 *   영문 숫자 특수문자는 
 *   
 *   
 */
 