package koreait.day11.test;

public class Crow extends Animal{	//까마귀
	protected int wings;  //디폴트 한정자+다른패키지 자식클래스
	

	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type=Animal.CROW;
	}
	public void print(){
		System.out.println("까아악");
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
		
	}
	@Override
	public void act() {
		System.out.println("Crow eats twie a day");
		
	}
	 @Override
	public String eat(Object object) {
		return "먹이는 + " + object + "입니다" ;
		
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
