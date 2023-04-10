package quiz02;

public class Car {

	String model = "티코";
	int price = 1000000;
	String color = "화이트";
	
	
	Car(){
		
	}

	Car(String pModel, int pPrice, String pColor){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	Car(String pModel, String pColor, int pPrice){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	void info(){
		System.out.println("브랜드 : " + model + "입니다.");
		System.out.println("가격은 : " + price + "입니다.");
		System.out.println("색상은 : " + color + "입니다.");
	}
	
	void current() {
		if( model.equals("티코")) {
			System.out.println("단종된 모델입니다.");
		}else {
			System.out.println("판매중인 모델입니다.");
		}
	}
	
	
	
}
