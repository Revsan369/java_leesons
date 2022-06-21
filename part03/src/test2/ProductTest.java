package test2;



//ÀÛ¼ºÀÚ ±èÇü¼ö
public class ProductTest {

	public static void main(String[] args) {
		//13
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "»ïÃµ¸®", 15);
		cart[1] = new Electronics(35000,"USB",120.0);
		cart[5] = new Electronics(117000,"ipad",120.0);
		cart[7] = new Electronics(2250000,"lg³ÃÀå°í",0.9);//14
		
		//System.out.println(cart[7].getClass(koreait.bike));
		
	
		//15
	for(Product temp : cart)
			if(temp!=null && temp.getPrice() >= 100000)
				System.out.println(temp);
	
	System.out.println("Bike_________________________");
	System.out.println("bike1 : " + cart[0]);
	System.out.println("bike2 : " + cart[1]);
	System.out.println("Electronics_________________________");
	System.out.println("Electronics : " + cart[2]);

	
	
	
	
	}
	}
		class Electronics extends Product {
			double kwh;
			
			public Electronics(int price,String prdName ,double kwh) {
				this.setPrice(price);
				this.prdName=prdName;
				this.kwh=kwh;
			}

			public double getKwh() {
				return kwh;
			}

			public void setKwh(double kwh) {
				this.kwh = kwh;
			}

			@Override
			public String sell(Object obj) {
				
				return String.format(prdName,1 );
			}

			@Override
			public String toString() {
				return "Electronics [kwh=" + kwh + ", prdName=" + prdName + ", getPrice()=" + getPrice() + "]";
			}
			protected double power() {
				System.out.println("kw per day : "  );
				return kwh*24;
				
				
			}
		}
	




