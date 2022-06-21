package koreait.day08;
//작성자 김형수
public class Member {
	private String  name;
	private String email;
	private int age;
	private int level;
	
	public Member(String name, String email) {
		this.email=email;
		this.name=name;
	}
	
	public Member() {
		System.out.println("name,email,age,level필드는 기본값입니다");
		System.out.println("name= " + this.name);
		System.out.println("age" + this.age);
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		;
	}
	public String getEmail() {
		
		return email;
		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getLevel() {
		return level;
		
	}
	public void setLevel(int level) {
		this.level = level;
		
	}
	
	
	
	
}
