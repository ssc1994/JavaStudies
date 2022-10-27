package quiz05;

public class Account {
	
	String name;
	String password;
	int balance;
	
	Account(){
		
	}
	
	
	Account(String n, String p, int b){
		name = n;
		password = p;
		balance = b;
	}
	
	void deposit(int a) {
		balance += a;
	}
	
	void withdraw(int a) {
		balance -= a ;
	}
	
	int getBalance() {
		return balance;
	}

}
