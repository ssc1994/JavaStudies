package quiz05;

public class MainAccount {
	
	public static void main(String[] args) {
		

		MyAccount myAcc = new MyAccount("홍길동","1234",3600);
		
		myAcc.deposit(800);
		myAcc.withDraw(1600);
		
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은 : " + bal + "원입니다.");

	}
}
