package day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		try {
			
			String message = null;
			int cnt = message.length();
			
			System.out.println("int >>> ");
		//	int n = sc.nextInt(); 
			int n = Integer.parseInt(sc.nextLine()); // java.lang.NumberFormatException
			System.out.println("input int : " + n);
//		} catch (NullPointerException e) {
//			System.out.println("err : " + e.getMessage()); //exception e지역변수 /local variable
//			System.out.println("user type err");
			// | = or in bit value 
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("err : " + e.getMessage()); 
			System.out.println("user type err");
			
		} finally {
			sc.close();
		}
		System.out.println("end");
	
	}

}
