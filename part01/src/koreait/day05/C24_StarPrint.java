package koreait.day05;
import java.util.Scanner;

public class C24_StarPrint {
public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
	System.out.println("[영화 감상후기]");
	System.out.print("평점 (1~5) >>>");
     int count = sc.nextInt();
     
     System.out.println("방법1");
     
     System.out.println("★");
     
     for(int i=0;i<count;i++) 
    	 System.out.println("★");
     
     
     
     System.out.println("방법2");
     for(int i = 0; i < count; i++)
     System.out.println("★");
     for(int i =0;i<5-count;i++)
    	 System.out.println("☆");
     
     for(int i=0;i<5;i++)
    	 if(i<count)
    		 System.out.print("★");
    	 else
    		 System.out.print("☆");
     
     int k;
     for(k=0;k<count;k++)
    	 System.out.print("★");
    		 
    		 System.out.println("k =" + k);
    		 for (;k<5;k++)
    			 System.out.print("☆");;
     
     
     
     
}
}
