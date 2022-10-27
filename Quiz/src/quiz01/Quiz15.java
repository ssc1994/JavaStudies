package quiz01;

public class Quiz15 {
	
	public static void main(String[] args) {
		
		//출력은 가로, 세로 밖에 없음
		//정렬은 \t  -> 8칸 띄어쓰기
		for(int i = 1; i <= 9; i+=3) { //3바퀴 돌리기
			
			for(int j = 1 ; j <= 9; j++) { //9바퀴 돌리기
				System.out.printf("%d x %d = %d\t", i, j,i*j);
				System.out.printf("%d x %d = %d\t", i+1, j,(i+2)*j);
				System.out.printf("%d x %d = %d\n", i+2, j,(i+2)*j);
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==========================");
		
		
		
//		
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 1 ; j <= 3; j++) {
//				System.out.printf("%d x %d = %d\t", j, i,j*i);		
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 4 ; j <= 6; j++) {
//				System.out.printf("%d x %d = %d\t", j, i,j*i);		
//			}
//			System.out.println();
//		}
//		System.out.println();
//		for(int i = 1; i <= 9; i++) {
//			
//			for(int j = 7 ; j <= 9; j++) {
//				System.out.printf("%d x %d = %d\t", j, i,j*i);		
//			}
//			System.out.println();
//		}
//		
		
	}

}
