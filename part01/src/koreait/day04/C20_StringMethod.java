package koreait.day04;

public class C20_StringMethod {
 public static void main(String[] args) {
	
	 String message = "hello~"; //java.lang.String (기본 페키지)
	 
	 message.indexOf('e'); //int
	 message.indexOf("lo");
	 message.substring(2); //String
	 message.substring(2, 4);
	 message.replace("ll", "*@");
	 int m =message.indexOf('y')-1;
	 
	 System.out.println();
	 
		/*
		 * message.length();//return int message.charAt(0);//
		 * 
		 * message.equals("hello");
		 */
	 String test = "hello~hello~";
	 int len = message.length();// 6 char
	 char temp = message.charAt(3);
	 boolean istae = message.equals("Hello~"); // 
	 
	 System.out.println("length = " + len);
	 System.out.println("charArt(3) = " + temp);//0123
	 System.out.println("equals = " + istae); //false Hello~ =! helllo~
	 
	 System.out.println("test index of e  = " + test.indexOf("lo"));
	 System.out.println("test  last index of lo = " + test.lastIndexOf("lo"));
	 
	 System.out.println("index of e  = " + message.indexOf('e'));
	 System.out.println("index of lo = " + message.indexOf("lo"));
	 System.out.println("index of lo = " + message.indexOf("ol"));
	 System.out.println("substring 2 = " + message.substring(2));
	 System.out.println("substring (2, 4) = " + message.substring(2, 4));
	 System.out.println("substring (1, 4) = " + message.substring(1, 4));
	 System.out.println("replace(11,@) " + message.replace("ll", "*@"));
	 System.out.println("" + message.startsWith("H"));
	 System.out.println("" + message.endsWith("~"));
	 System.out.println("index of e  = " + m);
	
}
}
