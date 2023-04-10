package com.ssc.quiz2;

public class Main {

	public static void main(String[] args) {
		System.out.println("     0");
		for( int i = 1 ; i <= 7 ; i+=2) {
			for(int j =i/2  ; j<=3 ; j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(int j = 0 ; j<i ; j++) {
				System.out.print(" ");
			}
			System.out.print(i+1);




			System.out.println();
		}
		System.out.println("90123456789");
	}
}
