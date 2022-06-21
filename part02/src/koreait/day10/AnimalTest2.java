package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();
		Animal ani2 = new Cat();
		
		Dog puddle =new Dog();
		Crow crow = new Crow();
		
		Dog dog = new Dog();
		
		System.out.println("::::::::::::");
		 //animal(ani1);
		 animal(ani2);
		 //animal(puddle);
		 //animal(crow);
		 //animal(new Frog());
	}
	public static void animal(Animal animal) {
		
		animal.act();
		
		animal.print();
		System.out.println("dog ?" +(animal instanceof Dog));
		System.out.println("crow ?" +(animal instanceof Crow));
		System.out.println("frog ?" +(animal instanceof Frog));
		System.out.println("cat ?" +(animal instanceof Cat));
		
		//animal.jump(); -Frog
		//animal.run();  -Dog
		//animal.fly();  -Crow
		//animal.sound(); - cat
		
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal;cat.sound();
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;dog.run();}
		
		if(animal instanceof Crow) {
			crow = (Crow)animal;crow.fly();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;frog.jump();
			}animal.print();
		}
	}//animal 메소드의 end
		
		class Frog extends Animal{
			
			protected int legs;
			
			public void jump() {
				System.out.println("세가족은 frog");
				setName("개구리");
				setColor("초록");
				System.out.println("튿징: 점핑" );
			}
			@Override
			public void act() {
				//super.act();
				System.out.println("Animal act jumping");
			}
			}
		class Cat extends Animal {
			
			
			protected String eyes;
			
			public Cat () {
				System.out.println("세가족은 dog");}
			public void sound() {
				setName("강아지");
				setColor("검정색");
				System.out.println("특징 : 달리기");
			}
			@Override
			public void act() {
				System.out.println("Animal act sound");
			}
			}

	


