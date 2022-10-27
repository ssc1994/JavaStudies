package quiz01;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//안녕 출력
		method1();
		
		//전달받은 매개변수 리턴
		method2("점심시간은 12:50");
		
		//세 매개변수 합 리턴
		double d = method3(3,3,3.141);
		System.out.println(d);
		
		//매개변수가 짝수면"짝수" 홀수면 "홀수" 리턴
		String s = method4(5);
		System.out.println(s);
		
		//매개 변수 int 만큼 String 반복 출력
		method5(3,"반복");
		
		//매개변수 2개를 입력받아서 큰 수 리턴
		System.out.println(maxNum());
		
		//절대값 리턴
		abs(-16);
		System.out.println(abs(-16));
		
		String str = java(5);
		System.out.println(str);
		
		System.out.println(yak(6));
		
		
	}
	//~
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String str) {
		System.out.println(str);
		return str;
	}
	
	static double method3 (int a, int b, double c) {
		return  (a+b+c);
	}
	
	static String method4 (int a) {
		if(a%2==0) {
			System.out.println(a+"의 리턴값은 짝수");
			return "짝수";
		}else {
			System.out.println(a+"의 리턴값은 홀수");
			return "홀수";
		}
	}
	
	static void method5 (int a, String str) {
		for ( int i =0 ; i < a ; i++) {
			System.out.println(str);
		}
	}
	
	static int maxNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개 입력 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		return a > b ? a:b;
//		if(a>b) {
//			return a;
//		}else if(a<b) {
//			return b;
//		}
//		return 0;
	}
	
	static int abs(int a) {
		if(a<0) {
			a=a*-1;
		}
		return a;
	}

	static String java(int a) {
		//자바 n번 
		//홀수면 뒷글자 삭제
		//짝수면 n/2번 반복
		String java = "";
		
		for( int i = 1 ; i<=a ; i++) {
			if(i%2!=0) {
				java+="자";
			}else {
				java+="바";
			}
		}
		
		return java;
		
	}
	
	static int yak(int a) {
		int sum = 0;
		for( int i = 1; i<=a ; i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	
	
}
