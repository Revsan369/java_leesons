package koreait.day08;

import java.util.Scanner;

public class Myclass2Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	MyClass2 my2 = new MyClass2();//오류  커스텅 생성자를 정의하면 기본 생성자가 사라짐 
	MyClass2 my22 = new MyClass2("momo");
	
	System.out.println("my2 name : " + my2.getName());
	System.out.println("my22 name : " + my22.getName());

	my2.getAge();
	System.out.println("age = " +my2.getAge());
	my22.getAge();
	System.out.println("age22 = " +my22.getAge());
	my2.getName();
	System.out.println("name = " +my2.getName());
	my22.getName();
	System.out.println("name22 = " +my22.getName());
	
	
	
	
}
}
