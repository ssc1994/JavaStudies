package quiz01;
import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		
		/*
		 * 입력을 세개를 받음
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]");
		String str1 = scan.next();
		
		System.out.print("정수 2 : ");
		int a2 = scan.nextInt();
		
		int a3 = 0;
		
		switch (str1) {
		case "+":
			a3 = a1+a2;
			System.out.println("두 수의 덧셈문 : " + a3);
			break;
		case "-":
			a3 = a1-a2;
			System.out.println("두 수의 뺄셈문 : " + a3);
			break;
		case "*":
			a3 = a1*a2;
			System.out.println("두 수의 곱셈문 : " + a3);
			break;
		case "/":
			a3 = a1/a2;
			System.out.println("두 수의 나눔문 : " + a3);
			break;

		default:
			System.out.print("[+, -, *, /]중 한개를 입력하세요");
			break;
		}
				
		
	}

}
