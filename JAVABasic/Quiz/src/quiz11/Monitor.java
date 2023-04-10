package quiz11;

public class Monitor {

	String moninf;

	public Monitor() {
		
	}	
	public Monitor(String moninf) {
		this.moninf = moninf;
	}

	public void info() {
		System.out.println("----모니터 정보----");
		System.out.println("from " + moninf);
	}
}
