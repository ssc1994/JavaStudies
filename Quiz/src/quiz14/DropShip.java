package quiz14;

public class DropShip extends Unit{

	public DropShip() {
		super(60);
	}
	
	@Override
	public void location() {
		System.out.println("x는 : " + this.x + ", y는 : " + this.y);
	}

	@Override
	public void move(int x, int y) {
		this.x +=x;
		this.y +=y;
	}
	
	
}
