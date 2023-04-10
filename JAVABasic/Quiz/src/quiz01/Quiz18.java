package quiz01;
import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		
		/*
		 * 랜덤한 덧샘 문제를 내는 프로그램
		 * 반복이 실행될때마다 1~100 사이의 랜덤한 덧셈 구문이 출력됩니다.
		 * 
		 *  0을 입력받으면 프로그램을 종료합니다.
		 *  프로그램이 종료되면 정답횟수, 오답횟수를 출력하면 됩니다.
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		int correct = 0;	 //정답
		int wrong = 0; 		 //오답
		
		
		program : while(true) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			
			System.out.printf("%d + %d = ?\n",a,b);
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print("정답은 : ");
			int c = scan.nextInt();
			
			if(c==0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : " + correct);
				System.out.println("오답 : "+ wrong);
				break program;
			}
			else if(a+b ==c) {
				System.out.println("정답입니다");
				System.out.println("--------------------------");
				correct++;
			}else if(a+b !=c) {
				System.out.println("오답입니다");
				System.out.println("--------------------------");
				wrong++;
			}
			
		}
		
		
		
	}

}
