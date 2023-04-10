package quiz01;
import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
//		
//		int a = 1;
//		
//		while(a<=20) {
//			System.out.println(a+"번 학생의 출석을 체크");
//			a++;
//		}
//	
		/* 정수를 입력받아서
		 * 입력받은 값에 대한 구구단을 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int a=1;
		System.out.println("구구단 : "+num+"단");
		
		while(a<=9) {
//			System.out.println(num + " x " + a + " = " + num*a);
			System.out.printf("%d x %d = %d\n", num,a,num*a);
			a++;
		}
		
	}

}
