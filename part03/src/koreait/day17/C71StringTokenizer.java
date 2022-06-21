package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C71StringTokenizer {
    // token : ()       
	public static void main(String[] args) {
		String temp = "momo 90 88 79";
		
		//tokenizer class ±âº» ¹®ÀÚ °ø¹é,ÅÇ , ÁÙ¹Ù²Þ
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken met ");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("hasMoreTokens?" + stk.hasMoreTokens());
		
		//¡è(Tok pointer, n)
		System.out.println("2. hasMoreToken method");
		stk = new StringTokenizer(temp);//resummon stk
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
			
		}
		
		System.out.println("3. multiple markers");
		temp = "momo,,90 88()79";//unlike split tok does not print empty data 
		stk =new StringTokenizer(temp, " ,()");
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		System.out.println("4. tokenizer ");
		temp = "momo 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
		}
		System.out.println("score = " + score);
		System.out.println("total :" + score.sum());
		System.out.println("ave :" + score.ave());
		System.out.println("sem :" + score.getGrade());
		
		// convert to List
		temp = "momo 90 88 79\nnana 78 83 79\nnsinbi 92 73 66";
		stk = new StringTokenizer(temp);
		List<Score> scores = new ArrayList<>();
		while(stk.hasMoreElements()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			
			scores.add(score);
		}
		System.out.println("tokenizer result" + scores);
		
		scores.clear();
		//make split method 
		String[] result = temp.split("[ \n]");
		for(int i=0; i<result.length;i+=4) {
			Score s = new Score(result[i+0],
					Integer.parseInt(result[i+1]),
					Integer.parseInt(result[i+2]),
					Integer.parseInt(result[i+3]));
					scores.add(s);
		}
		System.out.println("split list" + scores);
}
}
