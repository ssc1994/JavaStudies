package quiz01;
import java.util.Scanner;

public class Quiz09 {
	
	public static void main(String[] args) {
	
		// 두 수를 입력 받습니다.
		// 두 수 사이의 합을 구하시오.
	
		//숙제
		// 1. 큰수 작은수 비교
		// 2. 작은수~큰수 반복
		Scanner scan = new Scanner(System.in);

		int sum=0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = a>b? a:b;
		int min = a>b? b:a;
		
		while(min<=max) {
			sum+=min;
			min++;
		}
		System.out.println(sum);
		
		
	}

}
