package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyCart my = new MyCart(5000);
		Radio ra = new Radio();
		Computer comp = new Computer();
		Tv tv = new Tv();
		
		
		my.buy(comp);
		my.buy(ra);
		my.buy(tv);
		my.buy(comp);
		my.buy(ra);
		my.buy(comp);
		my.buy(ra);
		my.buy(tv);
		my.buy(comp);
		my.buy(ra);
		
		
		
	}

}
