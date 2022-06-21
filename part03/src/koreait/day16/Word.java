package koreait.day16;
//search enum ()
public class Word {
	public static final int BASIC =1;
	public static final int PRACTICAL =2;
	public static final int EXPERT =3;
	
	
	private String english;
	private String korean;
	private int level;
	
	
	
	@Override
	public String toString() {
		return english + " " + korean + " " + level + (this.level==Word.BASIC? "easy"
				:this.level==Word.PRACTICAL?"normal":"expert") + ")";
	}

	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public Word(String english) {
		this.english = english;
	}
	
	public Word(String english,String korean) {
		this.english = english;
		this.korean = korean;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public void setEnglish(String english) {
		this.english = english;
	}
	
	public String getKorean() {
		return korean;
	}
	
	public void setKorean(String korean) {
		this.korean = korean;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
}
