package koreait.day09;
import java.util.Scanner;

public class C43_RedpenExam2 {
	 
		public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int size=5;
	
	MathProblem[] problems = new MathProblem[size];
	
	int ans;// n1 n2 
	
	int cnt=0;
	System.out.println("--------------------------------");
	System.out.println("2자릿수 문제");
	System.out.println("--------------------------------");
	System.out.println("시작");
	for(int i =0;i<size;i++) {
	
		MathProblem temp = new MathProblem('*');
		temp.makeProb();  // n1,n2 난수 셍성
		//System.out.print("문재" + (i+1) +"." + temp.getN1() + "+" + temp.getN2()+ "= >>>");
		System.out.print("문재" + (i+1) +"." + temp.problem() + "= >>>");
		
		ans = sc.nextInt();
		if(ans == temp.showAnswer()){//맞은 겟수 
		cnt++;
		temp.setCrrect(true);
		}
		problems[i] = temp;
	}
	System.out.println("-------------------------------------");
	System.out.println("맞은겟수 " + cnt + "(" + cnt*100/size+ "점" );
	System.out.println("::::::::틀린문제 정답 보기:::::::::::::::");
//	for(int  i=0;i<problems.length;i++)
//		//if(problems[i].isCrrect()==false)
//	      if(!problems[i].isCrrect())
//	System.out.println("문제" +(i+1)+ ". " + problems[i].problem() + problems[i].showAnswer());
	//for each  로 표현
	for(MathProblem temp:problems)
		if(!temp.isCrrect())
			System.out.println(temp.problem() + temp.showAnswer());
	
	sc.close();
}
}
