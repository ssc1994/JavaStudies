package quiz01;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * 정수형태로 입력을 2개 받습니다.
		 * 첫번째 입력은 가로의 길이
		 * 두번째 입력은 세로의 길이
		 * 
		 * 입력받은 가로,세로 길이의 사각형을 출력하면 됩니다.
		 * 단, 윤곽만 출력
		 * 
		 * 힌트 => 1행, 마지막행, 1열, 마지막열만 출력, 공백도 문자임
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("가로 : ");
		int w = scan.nextInt();
		System.out.print("세로 : ");
		int h = scan.nextInt();

		for(int i = 1; i<=h;i++) {
			
			for(int j = 1; j<=w; j++) {
				
				if(i==1 || i==h || j==1 || j== w) {  //1행, 마지막행, 1열, 마지막열
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=============================================");		
		
		for(int i =1;i<=h;i++) {					//i는 높이 번 돌아감
			if(i==1 || i==h) {						//i가 첫번째나 마지막이라면
				for(int j =1;j<=w;j++) {			//j가 w(넓이)만큼 돌아감
					System.out.print('*');
				}
				System.out.println();
			}else {
				for(int j =1;j<=w;j++) {			//j는 넓이 만큼 돌아감
					if(j==1||j==w) {                //j가 1번째나 마지막이면 * 출력
						System.out.print('*');
					}else {                         //j가 첫번째나 마지막번째가 아니라면 공백 출력
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}
}
