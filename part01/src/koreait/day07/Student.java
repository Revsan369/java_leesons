package koreait.day07;
//C39
public class Student {

	int no;
	int grade;
	String name;
	Score score;
	//인자로 전달받는 갑ㅅ을 전역변수(필드 객체의 특성을나타네는 구성요소)에 대입
	void setData(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", grade=" + grade + ", name=" + name + ", score=" + score + "]";
	}
}
