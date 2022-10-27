package quiz01;
import java.util.Scanner;

public class Quiz12 {
	
	public static void main(String[] args) {
		
		
		//7~100까지정수중의 7의 배수를 가로로 출력
		
		for(int i = 7; i<=100; i++) {
			if(i%7==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//1~200까지의 정수중의 9의 배수의 개수를 출력
		int count = 0;
		for(int i=1; i<=200; i++) {
			if(i%9==0) {
				count++;
			}
		}
		System.out.println(count);
		
		//50~100까지 두 수 사이의 합
		int sum = 0;
		for(int i = 50; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		//char 변수를 활용해서 A~Z까지 출력 'A' = 65 // 'Z' = 90
		//int a = 65로 하거나 char a= 'A' 둘다 사용가능하지만 
		//int로 할때엔 print에 (char)로 캐스팅 해줘야 원하는 알파벳으로 출력가능하다
		for(char a = 'A' ; a<='Z'; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		//어떤수를 입력받아서 입력받은 수의 구구단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int a = scan.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d x %d = %d",a,i,a*i);
			System.out.println();
		}
		
			
	}

}
