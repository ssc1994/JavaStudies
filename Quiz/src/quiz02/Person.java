package quiz02;

public class Person {

	
	int age;
	String name;
	
	//name, age를 매개변수로 받는 생성자
	
	Person(){
		
	}
	
	Person(int page, String pname){
		
		age = page;
		name = pname;
		
		
	}
	
	String info() {
		String inf = "이름 : "  + name + ", 나이 : " + age;
		
		return inf;
		
	}
	
}
