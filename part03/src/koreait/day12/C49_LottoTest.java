package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers =
				new ArrayList<>();
		
		for (int i = 0; i < 45; i++) {  // 인덱스의 범위 : 0 ~ 44  -> 난수로 뽑히는 값
			numbers.add(i + 1);  
		}
		System.out.println("numbers");
		System.out.println(numbers);  //toString이 재정의
		
		Random r = new Random();
		
		ArrayList<Integer> lotto =
				new ArrayList<Integer>();
		
		
		int k; //난수로 뽑힐 값 인덱스 정합니다.
		
		for(int cnt=0;cnt<6;cnt++) {
			k=r.nextInt(45-cnt);
			System.out.println("k="+k + ",number =" + numbers.get(k)); //뽑힌 숫자의 인덱스와 그 숫자의 값
			lotto.add(numbers.get(k));
			numbers.remove(k);		//뽑힌 값 리스트에서 삭제
			System.out.println("남은 공 ");
			System.out.println(numbers);
		}
		
		
		System.out.println("최종 선택 숫자 6개");
		System.out.println(lotto);
	}
//배열은 저장된 값의 위치 변경(삽입/삭제) 메소드가 없습니다.배열의 크기는 정적입니다.
//  -> 	이런 부분을 ArrayList가 해결하고 웹프로그래밍할때  ArrayList가 필수입니다.
}
