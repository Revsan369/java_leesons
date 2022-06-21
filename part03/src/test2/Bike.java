package test2;
//작성자 김형수
public class Bike extends Product{
	//e	
	private int speed;
	
	//f
	public Bike(int price,String prdName ,int speed) {
		this.setPrice(price);
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %ㅇ %% 인하", obj);
	}
	
	//e
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//g
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + getPrice() + ", prdName=" + prdName + "]";
	}
	
	public int ride () {
		System.out.println("당신은 이것을 시속 " + speed + "km 로 탈수있습니다 ");
		return speed;
		
	}
}
