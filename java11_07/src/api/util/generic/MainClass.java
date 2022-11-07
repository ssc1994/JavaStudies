package api.util.generic;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ABC<String> abc =new ABC<>();	//뒤에 있는 괄호는 생략 가능
		abc.setAbc("GG");
		
		String s = abc.getAbc();
		
		ArrayList<String> a = new ArrayList<>();
	}

}
