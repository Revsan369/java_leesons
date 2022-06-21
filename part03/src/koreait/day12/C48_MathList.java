package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제에서 배열을 리스트로 변경하기  //작성자 : 김땡땡
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=5;		//문제 갯수(반복횟수)
		ArrayList<MathProblem> problems = new ArrayList<>();
		int ans;	int cnt=0;
		
		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			System.out.print("문제 "+(i+1)+".  " + temp.problem() + " 답 입력 -> ");		
			ans = sc.nextInt();
			
			if(ans==temp.showAnswer()) {
				cnt++;	temp.setCorrect(true);
			}
			//	problems[i]=temp;  //?????     //배열 인덱스 i 에 temp객체 참조값을 저장해라
			problems.add(temp);
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (cnt*100/size) +" 점)"); // 100/size 는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
	//??????	
		for(int i=0;i<problems.size();i++)
			if(!problems.get(i).isCorrect()) //problems[i].isCorrect()이  거짓이면 !연산으로 참으로 바뀝니다.
			System.out.println("문제 "+(i+1)+".  " 
						+ problems.get(i).problem() + problems.get(i).showAnswer());	
		
		
	}

}   //리스트의 메소드 1) add  2) get  3) remove  4) size
