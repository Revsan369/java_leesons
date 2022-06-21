package koreait.day09;

public class C44_ForEachTest {
	public static void main(String[] args) {
		//배열 for접근시 인대스 변수사용 
		
		int[] itest = {1,2,3,4,5,6};
		String[] stest = {"break", "public","each","package","while"};
		
		for(int i=0;i<itest.length;i++)
			System.out.println("i ="+ i + "itest[i] = " + itest[i]);
		//stest[i] = String
		
		
		//stest[i] = String
		
		for(int i=0;i<itest.length;i++) {
			int temp = itest[i];
			System.out.println("i ="+ i + "itest[i] = " + temp);
		
		}
		
		for(int i=0;i<stest.length;i++)
			System.out.println("i ="+ i + "stest[i] = " + stest[i]);
		
		System.out.println("itest 배열값");
		for(int temp : itest)  //배열에 저장된값을  temp에 저장
			System.out.println(temp);
		
		System.out.println("\n stest 배열값");
		for(String temp : stest)
			System.out.println(temp);
		
		//효율성위해 for(for each)사용 
	}

}

