package koreait.day11.test;

public abstract class Animal {
	
	static final int CAT =1;
	static final int DOG =2;
	static final int CROW =3;
	static final int FROG =4;
	static final int SNAKE =5;

	
	private String name;
	private String color;
	private String food;
	protected int type;
	
	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	public abstract void act(); 
	
	public abstract String eat(Object object);
		
	
		public void print() {
		System.out.println("name:" + name +",color:"+ color);
	}
	
		
		@Override
		public String toString() {
			
			return super.toString();
		}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void eat() {
		
		
	}

	}
	
//	public String getEat() {
//		return food;
//	}
//	public void setEat() {
//		this.food = food;
//	}
//	
	

