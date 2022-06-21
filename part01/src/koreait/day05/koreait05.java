package koreait.day05;
public class koreait05 {
 public static void main(String[] args) {
	 
	 int i = 10, sum =0;
	 i = i+1;
	 i+=1;
	 i++;
	 ++i;
	 System.out.println("i ++ ?" + i++);
	 System.out.println("i ++ ?" + i++);
	 sum = sum+i;//16
	 sum+=i;//32
	 System.out.println("sum ? " + sum);//32
	 //
	 i--;
	 --i;
	 sum = sum -10;
	 sum -= 10;
}
}
