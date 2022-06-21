package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class C70_StringSplit {
	
	public static void main(String[] args) {
		//
		String temp = "¸ğ¸ğ 90 88 79";
		String[] result = temp.split(" "); //return String[] 
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		
		for(int i=0;i<result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i,result[i]));
		}
		System.out.println("result length" +result.length);
		
		System.out.println("enhanced");
		for(String t : result)
			System.out.println("result : " + t);
		
		String temp2 = "momo,90,88,79";
		result = temp2.split(",");
		System.out.println("4");
		for(String t : result)
			System.out.println("result :" + t );
			
			temp2 = "momo,,90,,88,,79";
			result = temp2.split(",");
			System.out.println("5");
			for(String t : result)
				System.out.println("result :" + t );
				
				result = temp2.split(",,");
				System.out.println("6");
				System.out.println("result length" + result.length);
				for(String t : result)
					System.out.println( "res : " + t);
				
				temp2= "momo,90, 88()79";
				result = temp2.split("[ ,()]");
				System.out.println("regex");
				System.out.println("result length" + result.length);
				for(String t : result)
					System.out.println( "res : " + t);
				
				temp2= "momo,90,88,79";
				result = temp2.split(",", 2);
				//result = temp2.split(",", 3);
				//result = temp2.split(",", 6);
				System.out.println("8 split limit ");
				System.out.println("result length" + result.length);
				for(String t : result)
					System.out.println( "res : " + t);
				
				//list convert arrays to list
				result = temp2.split(",");
				System.out.println("9 convert result to list");
				List<String> rlist = Arrays.asList(result);
				System.out.println(rlist);
				System.out.println("rlist size : " + rlist.size());
				for(String t : rlist)
					System.out.println("rlist : " + t);
			//above rlist makes list Arrays static
				//rlist.add("test");
				//rlist.remove(2);
				//rlist.add(2,"100");
		//make list changeable 
				List<String> rlist2 = new ArrayList<String>(rlist);
				System.out.println(rlist2);
				rlist2.add("test");
				rlist2.remove(2);
				rlist2.add(2, "100");
				System.out.println(rlist2);
				
				List<Integer> ilist = Arrays.asList(1,2,3,4,5);
				System.out.println("11. Arrays.aslist");
				System.out.println(ilist);
				
				
	}

}
