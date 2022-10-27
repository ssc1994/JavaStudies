package quiz16;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 *  up down 게임
		 *  
		 *  1~100까지의 임의 숫자를 1번 생성
		 *  반복문 안에서 스캐너를 이용해서 정답을 입력받습니다.
		 *  
		 *  랜덤수가 입력받은 값보다 작으면 "더 큰수를 입력하세요"
		 *  랜덤수가 입력받은 값보다 크면 " 더 작은수를 입력하세요"
		 *  
		 *  정답이라면 시도횟수 : x회를 출력하고 종료
		 *  
		 *  만약에 숫자가 아닌값이 들어온다면 예외를 처리하고, 다시 입력
		 */
		
		int ran = (int)(Math.random()*100+1);
		int count=0;
		while(true) {
			Scanner scan = new Scanner(System.in);
			try {
				
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			
			count++;
			if(num<ran) System.out.println("더 큰수를 입력하세요");
			if(num>ran) System.out.println("더 작은수를 입력하세요");
			if(num==ran) {
				System.out.println("정답입니다. 시도횟수 : " + count);
				break;
			}
			
			
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아닌 수입니다. 다시 입력하세요");
				
			}
			
			
			
						
		}
		
		
		
	}
	
}
