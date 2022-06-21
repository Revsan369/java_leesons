package koreait.day06;

public class C32_ArrayMnipulation 
  {public static void main(String[] args) {
	//¹è¿­ »ğÀÔ»ëÁ¦
	  int[] test = {11,22,33,44,55,66,77};
	  int k= 2;
	  for(int i =test.length-2;i>=k;i--) {
		  test[i+1]=test[i];
		  
	  }
	  test[k]=23;
	  for(int i=0;i<test.length;i++)
		  System.out.print(test[i] + "\t");
	  
	  System.out.println("\n----------------------------------");
	 int[] test2 = {11,22,33,44,55,66,77};
	 for(int i =3;i<test2.length;i++) {
		 test2[i-1]=test2[i];
	 }
	 
	 for(int i=0;i<test2.length-1;i++)
		  System.out.print(test2[i] + "\t");
	 
}
}
