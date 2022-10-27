package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape c = new Circle("동글동글",4);
		
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
		Shape r = new Rect("네모네모",4);
		System.out.println(r.getName());
		System.out.println(r.getArea());
		
	}

}
