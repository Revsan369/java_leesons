package koreait.day08;
public class MyClass1 {

 
	private int age;
	private String name;
	public double point;
	
	void setAge(int age) {
		if(age>1 && age <=150)
		this.age=age;
		else
			System.out.println("잘못된값");
	}
	int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public double getPoint() {
		return point;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(double point) {
		this.point = point;
	}
}

