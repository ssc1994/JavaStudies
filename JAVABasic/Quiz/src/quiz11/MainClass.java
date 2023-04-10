package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
	Computer comp = new Computer();
	
	comp.setKey(new KeyBoard());
	comp.setMouse(new Mouse());
	comp.setMon(new Monitor("알파스캔"));
	
	comp.computerInfo();
	
	comp.getMon();
	
	
	
	}

}
