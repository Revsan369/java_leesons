package koreait.day11;
//추상클래스 : 객체를 직접생성하지 않는 형태의 클래스 입니다. new x
//추상메소드를 갖고 있습니다. 추상(abstract): 구체화되지 않은 상태.
//부모클래스에서 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것입니다.
//'person' is abstract 'son heungmin'not 
public abstract class  ClassAbs {

	 protected String name;//c class can be used from dif class 
	 public abstract void test();
	 
	 public void print() {
		 System.out.println("name" + name);
	 }
	 
	 public String getName() {
		 return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
