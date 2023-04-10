package quiz01;

public class Quiz08 {

	public static void main(String[] args) {

		//1~100까지의 정수중에서 3의 배수 이거나, 4의 배수일 경우 가로로 출력 
		int i = 1; 
		while(i<=100) {
			if(i%3==0 || i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		// 1~200까지의 정수중에서 6의 배수의 합계
		int a = 1;
		int b = 0; //누적시킬 변수

		while(a <=200) {
			if(a%6==0) {
				b+=a;
			}
			a++;
		}
		System.out.println(b);
		System.out.println("-----------------------------------------");

		// 1~100까지의 정수중에서 4의배수이면서, 8의 배수가 아닌수의 개수
		int c = 1;
		int d = 0;

		while(c<=100) {
			if(c%4==0 && c%8!=0) {
				d++;
			}
			c++;
		}
		System.out.println(d);
		System.out.println("-----------------------------------------");

		//1000의 약수의 개수의 개수 (약수는 나누어 떨어지는 수)

		int e = 1;
		int f = 0;

		while(e<=1000) {
			if(1000%e==0) {
				f++;
			}
			e++;
		}
		System.out.println(f);





	}

}
