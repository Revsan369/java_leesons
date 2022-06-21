package koreait.day12;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		
		int[] datas = {45,34,54,23,44};
		//size is static 
		
		ArrayList<Integer> list = new ArrayList<>();
		// 참조형 wrapper class
		//<> generic type 
		
		String[] names = {"쯔위","모모","은하","나나"};
		ArrayList<String> name_list = new ArrayList();
		
		list.add(45);
		list.add(7);list.add(21);list.add(44);list.add(45);list.add(45);
		
		System.out.println("ArrayList<Integer> = ");
		System.out.println(list);
		
	
	}

}
