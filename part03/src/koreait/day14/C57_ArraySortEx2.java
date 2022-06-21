package koreait.day14;
//자성자 김형수

public class C57_ArraySortEx2 {
	public static void main(String[] args) 
	{
	    String[] names = new String[] {"jenny","dahyun","nayeon","shinbi","eunha","momo"};
	   
	    for (int i = 0; i < names.length-1; i++) 
	    {     
	        for (int k = i + 1; k < names.length; k++) 
	        {  
	            int tmp = 0;                           
	            if (names[i].compareTo(names[k]) > 0) 
	            {          
	               String temp = names[i];               
	                names[i] = names[k];            
	                names[k] = temp;
	            }
	        }
	    }
	           
               for (int i = 0; i < names.length; i++) 
	           {     
	              System.out.printf("%s, ",names[i]);  
	           }
	}
	}
