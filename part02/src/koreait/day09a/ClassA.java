package koreait.day09a;
// class inherit
//class () under super  use extends to inherit (필ㄷ 메소드)
// private (접근한정자) cannot be inherrited
//protected allows inheriting with other packages
// make a category in for of class ex dog cat etc --> Animal inherit Animal  
public class ClassA { //parent class (Super Class)
	int ab;
	 String name;
	 protected String tittle;

	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}

}
