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
		System.out.println("μ ν κΈ°λ₯ π   1. λ¨μ΄μ μ₯     2. λ¨μ΄κ²μ     3. λ¨μ΄μ₯λ³΄κΈ°    4.λ λ°Έλ¬ κ²μ 5.νλ‘κ·Έλ¨ λλ΄κΈ°");
		boolean run = true;
		while (run) {		
			System.out.print("μ ν β->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("νκΈ λ» -> ");
				kor = sc.nextLine();
				System.out.println("level");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new  Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);
				//mywords.add(new Word(eng,kor));
				break;
			case "2":
				System.out.print("κ²μ λ¨μ΄ English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
				System.out.println("λ¨μ΄μ₯ κ²μνμ΅λλ€. κ²°κ³Ό =>" + w);
				break;
			case "3":
				//System.out.println("λ¨μ΄μ₯ μ μ²΄λ³΄κΈ° :" + mywords);
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
				System.out.println("πβπ¨μλͺ» μλ ₯λ μ νμλλ€.1~4 μλ ₯μλλ€.");
				break;
			}
		}	
		 try {
			save (mywords,"C:\\ESD\\mydictionary.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("::::  λμ λ¨μ΄μ₯ μ’λ£ν©λλ€. ::::");
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
			
		//μ κ²°κ³Ό μ°Έκ³ νμ¬ StringTokenizer λ‘ Word κ°μ²΄ λ§λ€κ³  mywords λ¦¬μ€νΈμ μΆκ°
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
	private static void all(List<Word> mywords) {//mywords μ μ°Έμ‘°κ°μ λ°μ λμΌ κ°μ²΄κ°λ¦¬ν΄
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




