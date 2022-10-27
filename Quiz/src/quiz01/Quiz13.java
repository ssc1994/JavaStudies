package quiz01;
import java.util.Arrays;

public class Quiz13 {
	
	public static void main(String[] args) {
		//절대 중복되지 않는 3개의 숫자를 뽑기
		/*
		 * 배열을 랜덤하게 15번정도 섞는다.
		 * 0~2번째 index값을 새로운 배열에 옮겨 담는다.
		 */
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] arr2 = new int[3];
		int temp = 0;
		
		for(int i = 0; i<arr.length;i++) {
			
			int ran = (int)(Math.random()*arr.length);
			temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;
		}
		
		for(int i = 0 ; i<arr2.length;i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
