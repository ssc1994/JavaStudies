package com.ssc.multithread;

public class Producer extends Thread{
	//공유자원 속성
	private Product myList;
	
	//생성자
	public Producer(Product myList) {
		this.myList = myList;
	}
	
	
	//스레드 클래스가 되기위해선 run을 오버라이딩 해야한다
	@Override
	public void run() {
		//삽입 작업을 26번 수행
		for(char ch = 'A' ; ch<='Z' ; ch++) {
			myList.put(ch);
			
		}
	}
	

}
