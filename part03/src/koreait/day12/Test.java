package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	int[] datas = {45,23,7,21,19,11,44};	//배열은 선언할때 배열의 크기를 정합니다.(정적)
	//배열은 기본형 데이터타입 int,double,long.... 또는 참조형 타입

ArrayList<Integer> list = new ArrayList<>();
//ArrayList는 크기가 동적입니다.
//데이터 타입은  참조형타입만 입니다. 기본형은 래퍼클래스를 사용합니다.
//<E> 는 제너릭 타입이라고 부릅니다.데이터 요소의 타입을 정합니다. Generic 

String[] names = {"쯔위","모모","신비","은하","나나"};
ArrayList<String> name_list = new ArrayList<>();


//ArrayList에 데이터 추가는 add() 메소드
list.add(45);
list.add(7);
list.add(21);list.add(19); list.add(11); list.add(44);

System.out.println("첫번째 ArrayList<Integer> 출력");
System.out.println(list);
//System.out.println("참고(배열) : "  + Arrays.toString(datas));
System.out.println("list = " + list.size());
System.out.println("2nd ArrayList " );
System.out.println(name_list);
System.out.println("list size" + name_list.size());

name_list.add("쯔위");name_list.add("모모");
name_list.add("은하");name_list.add("나나");
System.out.println("String");
System.out.println(name_list);
System.out.println("size" +name_list.size());

System.out.println("트정위치 데이터 추가");
list.add(1,23);
System.out.println("add(1,23) " + list);
name_list.add(2, "신비");
System.out.println("add() " + name_list);

System.out.println("");
System.out.println("get(3) "+ list.get(3));
System.out.println(" " + name_list.get(3));

System.out.println("remove");
list.remove(4);
name_list.remove(4);
System.out.println("remove " + list);
System.out.println("remove " + name_list);

System.out.println("\n6.특정값 알아내기");
System.out.println("베열" + Arrays.binarySearch(names,"신비"));
System.out.println("list" + name_list.indexOf("신비"));

System.out.println("\n7. 6번");
System.out.println("배열");
int i=0;
for(i=0;i<names.length;i++)
	if(names[i].equals("신비"))
		break;
System.out.println("index" +i);
System.out.println("list");
for(i=0;i<names.length;i++)
	if(name_list.get(i).equals("신비"))
		break;
System.out.println("index" +i);
System.out.println("\n8. contains");
System.out.println("나나" + name_list.contains("나나"));
System.out.println("다현" + name_list.contains("다현"));
System.out.println("모모" + name_list.contains("모모"));
// lastIndexof method로 마지막 일치요소 찾을수 있음
}
}
