package koreait.day10;

public class CostructorTest {
public static void main(String[] args) {
	
}
}

class product {
	int price;
//	public product () {
//		
//	}
	
	public product(int price) {
		this.price=price;
	}
	
}

class Food extends product{
	public Food (int price) {
		super(price);}
}

class Electronics extends product{
	public Electronics (int price) {
		super(price);
		
	}
}