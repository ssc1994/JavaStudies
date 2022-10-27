package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Person클레스를 파일로 정의
		 * 
		 * 멤버변수는 int age, String name
		 * 메서드는 info() : String - 멤버변수를 문자열로 더해서 반환
		 * 
		 * 메인에서는 Person 객체를 두개 생성해서 각각 확인
		 * 
		 */
		
		Person per = new Person();
		per.age = 20;
		per.name = "성수1";
		System.out.println(per.info());
		
		System.out.println("====================");
		
		Person per2 = new Person();
		per2.age = 30;
		per2.name = "성수2";
		System.out.println(per2.info());
		
		System.out.println("====================");
		
		Person p = new Person(29,"성수");
		String presult = p.info();
		System.out.println(presult);
		
		System.out.println("====================");
		System.out.println("====================");
		
		//멤버변수, 메서드, 생성자를 사용해서 
		//현실에 찾아볼 수 있는 물건을 생각해서 클래스를 표현
		//생성해서 사용 - 메서드 2개이상
		
		
		Car tico = new Car();
		tico.info();
		tico.current();
		
		System.out.println("====================");
		System.out.println();
		Car bmwx3 = new Car("x3", 10000, "블랙");
		bmwx3.info();
		bmwx3.current();

		
		System.out.println("====================");
		System.out.println();
		Car bmwx5 = new Car("x5", 10000, "블루");
		bmwx5.info();
		bmwx5.current();
		
		
		
		
		
	}

}
