package koreait.day08;
 
public class Score {

	private int korean;
	private int english;
	private int science;
	private String grade;
	
	void setKorean(int korean) {
		this.korean=korean;
		
		
		}
	int getKorean() {
		return korean;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	String getGrade() {
		return grade;
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
}
