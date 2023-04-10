package quiz09;

public class AirplaneMain {
	
	public static void main(String[] args) {
		SuperSonicAp sap = new SuperSonicAp("제주항공");
		
		sap.takeOff();	//상속

		sap.flyMode=0;	//오버라이딩
		sap.fly();
		
		sap.flyMode=1;
		sap.fly();
		
		sap.land();		//상속
		
		System.out.println(sap.info());
		
		
	}
	
	
	
}
