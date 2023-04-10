package quiz01;
import java.util.Scanner;

public class Quiz04 {
		
	public static void main(String[] args) {
	
		/*
		 * 정수를 하나 입력받습니다.
		 * 입력받은 값이 0인지, 홀수인지, 짝수인지, 음수인지 구별하는 else if 문
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = scan.nextInt();
		String result = null;
	
		if(a == 0) {
			result = "0";
		}else if(a <=0 ){
			result = "음수";
		}else if(a%2==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		System.out.println(a+"는 "+result+" 입니다.");
		
	}

}
