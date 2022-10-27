package quiz14;

public class MainClass {
	
	public static void main(String[] args) {
		
		Marine m = new Marine();
		m.location();
		m.move(3, 3);
		m.location();
		m.stop();
		System.out.println("Marine의 armor : " + Marine.armor);
		System.out.println("Marine의 attack : " + Marine.attack);
		
		System.out.println();
		System.out.println();
		
		Tank t = new Tank();
		t.location();
		t.move(0, 3);
		t.location();
		t.changeMode();
		
		System.out.println();
		System.out.println();

		t.stop();
		
		Unit d = new DropShip();
		d.location();
		d.move(4, 0);
		d.location();
		d.stop();
		
		
		
	}

}
