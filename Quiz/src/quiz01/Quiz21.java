package quiz01;
import java.util.Scanner;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		System.out.print("두 수 입력 : ");
		//1 - 입력받은 값을 반환시키고 (재활용)
		int a = num();
		int b = num();
		
		//2
//		int result = a+b;
		int result = sum(a,b);
		
		//3
		printresult(result);
//		System.out.println("두 수의 합 : "+sum(a,b));
		
	}
	
	static int num() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}
	
	static int sum(int a, int b) {
//		int sum = a+b;
		return a+b;
	}
	
	static void printresult(int result) {
		System.out.println("두 수의 합 : " + result);
	}

	
	
}
