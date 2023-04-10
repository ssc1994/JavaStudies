package programmers.com.ssc;

public class Lv1_keypad {


	public static void main(String[] args) {

		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "right";
		
		String answer= "";
		String ll = "1 4 7";
		String rr = "3 6 9";
		int left = 3;
		int right = 3;
		int sw = 3;

 		for( int i  = 0 ; i< numbers.length ; i++) {
			if(ll.contains(Integer.toString(numbers[i]))) {
				answer+="L";
				if( numbers[i] == 1) {
					left = 0;
				}else if(numbers[i] == 4) {
					left = 1;
				}else if( numbers[i] == 7) {
					left = 2;
				}
			}else if(rr.contains(Integer.toString(numbers[i]))) {
				answer+="R";
				if( numbers[i] == 3) {
					right = 0;
				}else if(numbers[i] == 6) {
					right = 1;
				}else if( numbers[i] == 9) {
					right = 2;
				}

			}else {
				sw =  numbers[i]/3; 
				
				
				switch (sw){ 
				case 0:
					if(left!=right) {
						if(numbers[i]%1==left )		{
							answer+="L";
							left = 0;
						}
						if(numbers[i]%1==right ) {
							answer+="R";
							right = 0;
						}
						break;
					}else {
						answer +="R";
						right = 0;
						break;
					}
					
				case 1:
					if(left!=right) {
						if(numbers[i]%2==left ) {
							answer+="L";
							left = 1;
						}
						if(numbers[i]%2==right ) {
							answer+="R";
							right =1;
						}
						break;
					}else {
						answer +="R";
						right =1;
						break;
					}
					
				case 2:
					if(left!=right) {
						if(numbers[i]%3==left ) {
							answer+="L";
							left = 2;
						}
						if(numbers[i]%3==right ) {
							answer+="R";
							right = 2;
						}
						break;
					}else {
						answer +="R";
						right =2;
						break;
					}
					
				default:
					break;
				}


//				answer+=Integer.toString(numbers[i]);
			}
		}
		System.out.println(answer);
		System.out.println("LRLLLRLLRRL");
	}
}
