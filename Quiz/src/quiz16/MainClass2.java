package quiz16;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		try {
			Calculator.input();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
