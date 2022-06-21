package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60CharSequence {
 
	//StringBuffer StringBuilder ...
	public static void main(String[] args) {

		String result = new String();
		System.out.println("result = " + result);
		System.out.println("1. String type test");
		for(int i=2;i<6;i++ ) {
			result += i + "/";
			System.out.println("result" + result);
		}
		
		
		StringBuffer sb = new StringBuffer();
		System.out.println("2. StringBuffer");
		for(int i=2;i<6;i++ ) {
			//StringBuffer 같은 객체에 추가되면거 반복 (id does not change)
			//if String is variable use StingBuffer
			sb.append(i).append(":");
			System.out.println("sb : " + sb);
		}
		//CharSequence interface
		//System.out.println("contains(CS s) "+sample.contains(CS s));
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3.contains method ");
		System.out.println("contains(reult) "+sample.contains(result));
		System.out.println("contains(sb)" + sample.contains(sb));
		
		
		//ArrayList 
		// HashMap         "        Map
		List<String> names = new ArrayList<String>();
		names = new Vector<String>();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map = new TreeMap<String, Integer>();
}
}
