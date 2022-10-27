package quiz14;

public class Tank extends Unit{
	
	private boolean mode;
	
	public Tank() {
		super(100);
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
	public void changeMode() {
		if (mode) {
			mode = false;
		}else {
			mode = true;
		}
		System.out.println("공격모드를 변경합니다");
	}

}
