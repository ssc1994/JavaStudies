package quiz18;

public class Main {
	
	public static void main(String[] args) {
		
		int [] [] board =  {{0, 0, 1, 1, 0}, 
							{0, 0, 0, 0, 0}, 
							{0, 0, 0, 0, 0}, 
							{0, 0, 1, 1, 0}, 
							{0, 0, 0, 0, 0}};
		
		//[3][2]가 폭탄이면
		//[2][1]~[2][3]
		//[3][1]~[3][3]
		//[4][1]~[4][3]
		
		int count=0;
		
		for( int i = 0 ; i< board.length;i++) {
			for(int j = 0 ; j<board[i].length ; j++) {
				if( board[i][j] == 1) {
					count++;
					if(i==0) {
						
						
					}
					
				}
			}
		}
		
	}

}
