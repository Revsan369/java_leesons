package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
 public static void main(String[] args) {
	
	 String messge = "hi java!"; // message = 참조변수
	 
	 String[] engKey = {"continue", "break", "public", "static", "dynamic"};
	 // int,double,char 배열에서는 요소를 나타네는 nums[2], carr[2], point[2] >>> 기본형
	 //engKey Qnsakey뿐만아니라 engKey[2] 는 String 참조형
	 
	 for(int i=0;i<engKey.length;i++)
		 System.out.println(engKey[i]);
	 
	 String[] koreans = new String[5]; //기본형 대이터 저당x 참조값저장
	 
	 for(int i=0;i<koreans.length;i++)
		 System.out.println(koreans[i]);//초기값이 없어서 참조할값이 없음 null
	 
	 System.out.println("1. engKey 배열요소값 참조 문자열의 길이");
	 for(int i=0;i<engKey.length;i++)
		 System.out.println(engKey[i] + ":" + engKey[i].length());
	 
	 koreans[0]="계속";
	 koreans[1]="멈춤";
	 koreans[2]="공용의";
	
	 System.out.println("2. koreans 배열요소값 참조 문자열의 길이");
	 for(int i=0;i<koreans.length;i++)
		 if (koreans[i] != null)//vip
		 System.out.println(koreans[i] + ":" + koreans[i].length());
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("static 뜻? >>> " );
	 koreans[3] = sc.nextLine();
	
	 System.out.print("dynamic 뜻? >>> " );
	 koreans[4] = sc.nextLine();
	 
	 System.out.println("3. 모두 입력된 koreans 배열확인");
	 for(int i=0;i<koreans.length;i++)
		 System.out.println(koreans[i]);
	 
	 //사용자가 입력한 영단어가 engKey  배열의 몇번째?
	 System.out.print("찾을단어는 >>> ");
	 String find =sc.nextLine();
	 
	 int i;
	 for(i=0;i<engKey.length;i++) {
		 if(find.equals(engKey[i]))
				 break; //i=0~ engKey.length-1
		 
		 System.out.println("찾을 단어위치" + i);
	  if(i==engKey.length)
	 System.out.println("없음");
		 else
		 System.out.println("한글뜻" + koreans[i]);
		 
		 if(i==-1)
			 System.out.println("찾는단어가 없습니다");
	 }
//	 int index=-1;
//	 
//	 for(int i=0;i<engKey.length;i++) {
//		 if(find.equals(engKey[i])) {
//			 index = i;
//			 break;
//		 }
//		 
//	 }
//	 System.out.println("찾을 단어위치" + index);
//	 if(index==-1)
//	 System.out.println("없음");
//	 else
//		 System.out.println("한글뜻" + koreans[index]);
//	 
//	 if(index==-1)
//		 System.out.println("찾는단어가 없습니다");
}
}
