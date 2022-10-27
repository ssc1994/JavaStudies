package quiz10;

public class User {
	
	private String name;
	private int age;
	private int rrn;
	
	public User() {

	}
	
	public User(String name, int age, int rrn) {
		super();
		this.name = name;
		this.age = age;
		this.rrn = rrn;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	
	
}
