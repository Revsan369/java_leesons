package koreait.day14;
//자성자 김형수

public class C57_ArraySortEx {
	public static void main(String[] args) 
	{
	    int[] nums = new int[] {34,77,19,56,45,9};
	   
	    for (int i = 0; i < nums.length-1; i++) 
	    {     
	        for (int k = i + 1; k < nums.length; k++) 
	        {  
	            int tmp = 0;                           
	            if (nums[i] > nums[k]) 
	            {          
	                tmp = nums[i];               
	                nums[i] = nums[k];            
	                nums[k] = tmp;
	            }
	        }
	    }
	           
               for (int i = 0; i < nums.length; i++) 
	           {     
	              System.out.println(nums[i]);  
	           }
	}
	}
