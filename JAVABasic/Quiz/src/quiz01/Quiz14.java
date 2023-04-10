package quiz01;

public class Quiz14 {
	
	public static void main(String[] args) {
		
		// 2단~9단까지 구구단을 세로로 출력.
		// 
		for( int i= 2; i<=9; i++) {
			System.out.println("구구단 : "+i+"단");
			for(int j =1; j<=9;j++) {
				System.out.printf("%d x %d = %d ", i, j,i*j);
				System.out.println();
			}
			System.out.println("-----------------");
			
		}
		
		
	}

}
