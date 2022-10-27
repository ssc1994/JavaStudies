package quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.result);
		
		System.out.println(cal.add(10));

		System.out.println(cal.circle(4));
		
		System.out.println("===============computer===========");
		
		Computer com = new Computer();
		
		
		System.out.println("더한 값은 : " + com.add(10));
		
		com.circle(3);
		System.out.println("원의 넓이는 : " + com.circle(4));
		
		com.rect(5);
		System.out.println("정사각형의 넓이는 : " + com.rect(3));
		
		com.rect(5, 4);
		System.out.println("직사각형의 넓이는 : " + com.rect(3, 3));
		
		com.rect(5, 4, 5);
		System.out.println("직육면체의 넓이는 : " + com.rect(3, 3, 3));
		
		
		
		
	}

}
