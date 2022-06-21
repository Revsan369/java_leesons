package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class C52_MyDictionaryver2 {

	public static void main(String[] args) {
		
	

		Scanner sc = new Scanner(System.in); 
		
//			
     	List<Word> mywords = new ArrayList<>();
     	try {
			read(mywords,"C:\\ESD\\mydictionary.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		Word mywords = new Word();
		String sel, eng, kor;
		int level;
		System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 단어장보기    4.레밸러 검색 5.프로그램 끝내기");
		boolean run = true;
		while (run) {		
			System.out.print("선택 ✏->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				System.out.println("level");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new  Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);
				//mywords.add(new Word(eng,kor));
				break;
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
				System.out.println("단어장 검색했습니다. 결과 =>" + w);
				break;
			case "3":
				//System.out.println("단어장 전체보기 :" + mywords);
				all(mywords); //arrange and print
				break;
			case "4":
				System.out.println("levels 1~3");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
				break;
			}
		}	
		 try {
			save (mywords,"C:\\ESD\\mydictionary.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("::::  너의 단어장 종료합니다. ::::");
		//sc.close();
		
	}
	
	
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("file saved");
		
	}
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String temp = sc.nextLine();
			System.out.println(temp.substring(0, temp.indexOf("(")));
			
		//위 결과 참고하여 StringTokenizer 로 Word 객체 만들고 mywords 리스트에 추가
		}
		sc.close();
		System.out.println("read done");
	}
   private static void level(List<Word> mywords, int no) {
		for(Word w  : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
				
				//System.out.println(level(mywords, no));
		
	}
	private static void all(List<Word> mywords) {//mywords 의 참조값을 받아 동일 객체가리킴
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
			
		});
		System.out.println(String.format("%-20s %-40s %-20s", "English","Korean","Level"));
		System.out.println("---------------------------------------------------------");
		for(Word w : mywords) {
		System.out.println(String.format("%-20s %-20s %-10d",w.getEnglish(),w.getKorean(),w.getLevel()));}
		
	}
	

	
}




