package quiz14;

public abstract class Unit {
	
	public int  x=0;
	public int  y=0;
	public int  hp;
	public Unit( int hp) {
		this.hp = hp;
		System.out.println("hp : " + hp);
	}
	
	public  abstract void location();
	public  abstract void move(int x, int y);
	public static void stop() {
		System.out.println("현재 위치에 정지");
	}
	
	

}
