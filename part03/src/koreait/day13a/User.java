package koreait.day13a;

//객체의 비교 두번째 방법 : 비교할수 있는 타입으로 만들기. Comparable<User> 인터페이스 구현.
public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	//Comparable 인터페이스 추상메소드 구현
	@Override
	public int compareTo(User o) {	//현재객체의 age와 인자값 age 비교
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2);   //오름차순
	}

	//Object 클래스 toString() 재정의
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}
