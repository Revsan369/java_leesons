package koreait.day09a;

public class Dog extends Animal {
	
	protected int legs;
	
	public Dog() {
		System.out.println("세가족은 dog");}
	public void run() {
		setName("강아지");
		setColor("검정색");
		System.out.println("특징 : 달리기");
	}
	}
