package quiz17;

public class MainClass {
	
	public static void main(String[] args) {
		

		
		try {
			System.out.println(Validation.Masking("940909-4121211"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================================");
		
		Validation.PalindromeCheck("다 같은 것 은 같다");
	
		
		
	}

}
