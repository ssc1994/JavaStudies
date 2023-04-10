package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		
//		/*
//		 *  입력받은 값을 한글자씩 char배열에 저장
//		 */
//		
//		String first = scan.next();
//		String first1 = first.toUpperCase();
//		
//		String second = scan.next();
//		String second1 = second.toUpperCase();
//		
//
//		//근본적인 방법 =  For문( 길이만큼 반복)  -> 변수.charAt(i)
//		
////		char[] arr = new char[second1.length()];
////		for(int i = 0; i< arr.length ; i++) {
////			arr[i] = second1.charAt(i);
////		}
//
//		char[] arr = second1.toCharArray();
//		
//		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
//		/*
//		 * 첫번째 입력받은 값을 한글자씩 char형으로 출력해보세요
//		 */
//		
//		String first = scan.next();
//		String first1 = first.toUpperCase();
//
//		String second = scan.next();
//		String second1 = second.toUpperCase();
//
//		char[] arr = second1.toCharArray();
//		System.out.println(Arrays.toString(arr));
//
//
//		//		for(int i = 0; i<second.length(); i++) {
//		//			System.out.print(second1.charAt(i)+" ");
//		//		}
//
//		System.out.println();
		
		
		/*
		 * 두 문자열을 입력 받습니다.
		 * 첫 입력에 알파벳이 주어집니다.
		 * 두번째 입력에는 알파벳으로 만들어진 문자열이 주어집니다.
		 * -> B
		 * -> DSFDSHJGFHGFJHGJNBVBVC 
		 * 
		 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어있는지 출력
		 */
		
		
		
		String a = scan.next();
		String au = a.toUpperCase();
		
		String b = scan.next();
		String bu = b.toUpperCase();
		String[] barr = bu.split("");
		int count = 0;
		
		for(int i = 0 ; i<barr.length ; i++) {
			if( barr[i].equals(au))
				count++;
		}
		System.out.println(count);
		
	}

}
