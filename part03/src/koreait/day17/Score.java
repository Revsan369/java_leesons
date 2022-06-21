package koreait.day17;

public class Score {

	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	void setKorean(int korean) {
		this.korean=korean;
		}
	
	String getGrade() {
		setGrade();
		return grade;
		
	}
	private void setGrade() {//can be private if needed
		if(ave() >=95) this.grade="A";
		else if(ave() >=80) this.grade="B";
		else if(ave() >=70) this.grade="C";
		else if(ave() >=60) this.grade="D";
		else this.grade= "F";
	}
	int getKorean() {
		return korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	
	public int getEnglish() {
		return english;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getScience() {
		return science;
	}
	public Score() {}
	
	public Score (String name, int korean, int english, int science) {
		this.english=english;
		this.science=science;
		this.korean=korean;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + grade + "]";
	}
	public int sum() {
		int result = this.korean+this.english+this.science;
		
		return result;
	}
	public double ave() {
		return (double)sum()/3;
		
		
	}
}
