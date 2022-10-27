package quiz01;
import java.util.Arrays;

public class Quiz23 {
	
	public static void main(String[] args) {
		
		//char배열의 요소를 문자열로 모두 붙여서 리턴
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		method06(arr);
		System.out.println(method06(arr));
		
		//배열의 요소의 합을 리턴
		int[] arr1 = {1,2,3,4,5};
		method07(arr1);
		System.out.println(method07(arr1));
		
		//매개변수를 배열에 저장하여 배열 리턴
		
		String[] str1 = method08("hello", "안녕하세요");
		System.out.println(Arrays.toString(str1));
		
	}
	
	static String method06(char[] a) {
		String str = "";
		for(int i =0 ; i<a.length ; i++) {
			str+=a[i];
		}
		
		return str;
	}
	
	static int method07(int[] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length ; i ++) {
			sum+=a[i];
		}
		return sum;
	}
	
	static String[] method08(String a, String b) {
		String s = a+b;
		String[] str = s.split("");
		
		return str;
	}
	

}
