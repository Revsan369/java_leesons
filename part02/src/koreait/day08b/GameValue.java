package koreait.day08b;

import java.util.Random;

public class GameValue {
		
		private String gamer;		//게임참가자 이름
		private int count; 			//게이머 시도횟수, 초기값 0
		private boolean success;	//맞추기 성공여부 , 초기값 false
		
		
		//커스텀 생성자 : gamer 초기값 설정
		public GameValue(String gamer) {
				this.gamer=gamer;
		}
		
		//객체가 사용하는인스턴스 메소드
		public void print() {
			System.out.println("gamer : " + gamer + ", 시도횟수 : " + count + ",성공 : " + success);
		}
		
		//static - 객체의 인스턴스 필드값을 사용하지 않는 경우. 즉, 객체와 상관없는 메소드 동작.
		public static int makeNumber(int min, int max) {	//min 101~ max 299 : 난수의 최소값,최대값 인자로 받고 난수 반환
			Random r = new Random();
			return r.nextInt(max-min+1)+min;    //r.nextInt(199)+101;  -> 0~198 + 101
		}// 참고 : r.nextInt(100) 은  0~99 범위의 난수

		public String getGamer() {
			return gamer;
		}

		public void setGamer(String gamer) {
			this.gamer = gamer;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		


		//getter 와 setter 
		
	
		
		
}
