package koreait.day06;

import java.util.Arrays;
import java.util.Random;

//작성자 김형수
public class C33_RealLotto {
	public static void main(String[] args) {
		int[] numbers =  new int[45];//뽑힐공에 해당되는 배열
		Random r = new Random();
		
		for(int i=0;i<45;i++) {// 배열 첫번째부터 45번째/i=44까지 -> 난수로 뽑히는값
		numbers[i]=i+1;// 값범위 1~45ㅡ> lotto 배열에 저장
		}
			System.out.println("numbers 배열초기값----------------------------");
			System.out.println(Arrays.toString(numbers));//문자열로 오버로딩
			System.out.println("-----------------------------------");
			
			int[] lotto = new int[6];//선택값 6개 로또
			int k;//뽑힐 값의 인덱스 - 난수로 정함
			for(int cnt=0;cnt<6;cnt++) { //lotto번호 6개를 구하기위한 for문
				k=r.nextInt(45-cnt);
				//cnt= 0,1,2,3,4,5 에대한 난수의 bound 값은 45,44,43,42,41,40 -> 중복 방지
				//k의 난수 범위? 0~44, 0,43,0~42...0,39
				System.out.println("k= " +k + "number =" + numbers[k]);//뽑은 번호 출력 k=배열 요소 위치 number= k 속의 데이터
				
				lotto[cnt]=numbers[k];//numbers 배열에서 난수로 뽑힌 인댁스k의 값 저장
				
				//k 위치값제거 : 인덱스 k+1 부터 마지막요소까지 왼쪽의로 이동
				for(int i=k;i<numbers.length-1;i++) {//중복방지
					numbers[i]=numbers[i+1];
				}
				System.out.println(Arrays.toString(numbers));//numbers 문자열로 오버로딩
			}
			System.out.print("최정 선택 숫자 : ");
			System.out.println(Arrays.toString(lotto));// 문자열상태로 로또 번호 출력]
			
			//System.out.println(lotto);
			//그냥 lotto 출력시 식별불가 10진수값 출력됨 ex(I@6f75e721)
			
			Arrays.sort(lotto);//로또값 순서대로 나열(정열)
			System.out.println(Arrays.toString(lotto));//나열후 ㄴString의로 오버로딩한 lotto값 출력
		}
		
	}


