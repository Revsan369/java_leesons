package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C63_TryCatchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		//try Çü½Ä
		try {
			//writ possible Exceptions >>> catch
		} catch (NullPointerException e) { 
			e.printStackTrace(); //print cause of error - Exception
			// case of error 
			//only execute when error caused by NullPointerException 
		}
		catch (InputMismatchException e) { //can add multiple catch
			
		} finally { // runs ignoring errors
			sc.close();
		}
		
		
	}

}
