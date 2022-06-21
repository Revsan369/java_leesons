package koreait.day05;

public class C22_AssignTest {
public static void main(String[] args) {
	 int i = 10, sum =0;
	 int j =5;
//	 j= j+1;
	// j += 4;
	// j++;
	 ++j;
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
	 System.out.println("sum ? " + sum);
	 System.out.println("j+1 ?" + j);
}
}

