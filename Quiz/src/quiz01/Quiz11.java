package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		/*
		 * 첫행의 입력값은 배열의 크기가 됩니다.
		 * 
		 * 배열의 크기만큼 반복을 돌면서, 입력받은 수 들을 배열에 순서대로 저장
		 * 5
		 * 10 => arr =[0]
		 * 20 => arr =[1]
		 * 30
		 * 40
		 * 50 => arr =[4]
		 *  arr = {10,20,30,40,50}
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int arr[] = new int[count];
		int i = 0;
		
		
		while (i<count) {
			System.out.print(">");
			int a = scan.nextInt();
			arr[i]=a;
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
