package quiz06;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	Calculator(){
		
	}
	
	
	int add(int a) {
		result+=a;
		return result;
	}
	
	double circle(int a) {
		
		return (pi * a * a);
	}

}
