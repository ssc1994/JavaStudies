package com.ssc.quiz3;

public class Main {

	public static void main(String[] args) {
		
		 String msg = "GCCGABCGCCGCCGBACGCCGCAGCCG";
		 for(int i = 0 ; i<msg.length()-3 ; i++) {
			 if(msg.charAt(i)=='G'&& msg.charAt(i+1)=='C' && msg.charAt(i+2)=='C'&& msg.charAt(i+3)=='G') {
				 System.out.println(i);
				 i+=3;
			 }
		 }
		 
		 
		
	}
	
	
	
}
