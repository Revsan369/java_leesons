package koreait.day09a;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("------------------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();
		System.out.println("---------------------------------");
		
		Crow crow =new Crow(); 
			crow.fly();
			crow.print();
			
			System.out.println("============================");
			Animal temp = dog;
			temp.print();
			//temp.run();
			temp.print();
			temp= crow;
			temp.print();
			
			Animal puppy = new Dog();
			puppy.print();
			//puppy.run(); 부모로 자식 불가
			
			Dog puddle = (Dog)puppy;//Animal 타입을 Dog 타입의로 강제 casting(자식클래스 Dog 객체이므로 ㄱㄴ)
		    puddle.print();     //puppy 변수가 참조하는 객체가 Dog 타입일때만 가능
	}

}
