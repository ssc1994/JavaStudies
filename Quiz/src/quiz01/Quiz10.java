package quiz01;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		//금액을 가장 큰 금액부터 나누어서 각 동전별로 몇개가 나와야하는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		int i = 0;
		
		
		while(i<arr.length) {
			int count = money/arr[i]; 
			money %= arr[i];
//			money = money-(arr[i]*count);
			
			System.out.println(arr[i] + "원 : " + count + "개");
			i++;
		}
		
		
		
		
	}

}
