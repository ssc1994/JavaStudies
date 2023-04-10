package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {

		/*
		 * 1. 사람수(정수)를 입력을 받습니다.
		 * 2. 입력받은 사람 수 만큼 랜덤한 배열을 생성해서 중복되지 않게 랜덤값을 저장
		 *  랜덤값의 크기는 1 <= x <= 사람수
		 * 
		 * 3. 중복되지 않는 배열이 생성 되었다면, ○문자를 이용해서 배열의 크기를 출력
		 * (ㅁ 한자 9)
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석이면 자리번호를 공개하고 출력.
		 * 	  제대로 선택되지 않은 좌석이면 다시 선택을 출력.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int ppl = scan.nextInt();
		int[] arr = new int[ppl];

		//arr배열에 중복되지 않게 랜덤값 저장
		for(int i = 0 ; i < arr.length ; i++ ) {	
			arr[i] = (int)(Math.random()*ppl+1);		//arr의 길이만큼 반복
			for(int j = 0 ; j < i ; j++) {				//i의 횟수까지 반복
				if(arr[i] == arr[j]) {					//조건식(i번째랑 j번째랑 똑같을때) 
					i--;		//조건식에 부합할때 i--를 써서 다시한번 i번째 조건식을 실행
				}
			}
		}

		//-------------------------------------------
		//		int size = scan.nextInt();
		//		int[] arr = next int[size];

		//		int index = 0;
		//		이름 : while(true){
		//			int seat = (int)(Math.random()*size)+1;
		//		
		//			for(int i = 0; i < index; i++){
		//				if(arr[i] == seat) continue 이름;
		//			}
		//		
		//			arr[index] = seat;
		//			index++;
		//		
		//			if(index==size) break;
		//		
		//-----------------------------------------

		//좌석 선택 프로그램
		String[] str = new String[ppl];
		for(int i = 0 ; i < str.length ; i++) {
			str[i] = "○";
		}

		int[] tarr = new int [ppl];
		for(int i = 0 ; i < tarr.length ; i++) {
			tarr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		int count = 0;
		//		Arrays.sort(arr);
		boolean flag = true;
		seat : while(flag) {
			String sarr = " ";			// 1~ppl.length 저장할곳
			String sstr = " ";			// ○ & ● 저장할곳
			for(int i = 0 ; i < tarr.length ; i++) {
				sarr+=tarr[i];
				if(i==tarr.length-1) break;
				sarr+= "  ";
			}
			for(int i = 0 ; i < str.length ; i++) {
				sstr+=str[i];
				if(i==str.length-1) break;
				sstr+= "  ";
			}
			
			System.out.println("-------좌석 선택 프로그램-------");
			System.out.println(sarr);		//1~ppl.length 출력
			System.out.println(sstr);		// ○ & ● 출력
			if(count == str.length) {
				flag = false;
				continue;
			}
			System.out.print("좌석 선택 : ");

			int c = scan.nextInt();
			if(c<=0 || c>str.length) {
				System.out.println("제대로 선택하실래요?");
				continue seat;
			}
			for(int i = 0 ; i < str.length ; i ++) {
				if(str[c-1].equals("●")) {
					System.out.println("제대로 선택하실래요?");
					break;
				}
				if(i == c-1) {
					str[i] = "●";
					System.out.println("자리번호를 공개합니다 : " + arr[c-1]);
					count++;
					break;
				}
			}
			System.out.println();
		}
		// 센세가 가르쳐주는방법
		
		
		
		
	}
}


