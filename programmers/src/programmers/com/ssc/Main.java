package programmers.com.ssc;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		String X = "100";
		String Y = "123450";
		String returnn = "";
		int[] xCount  = new int[10];
		int[] yCount  = new int[10];
		StringBuffer a = new StringBuffer();
		StringBuffer answer= new StringBuffer();//
		int count = 0;

		for( int i  = 0 ; i<X.length() ; i++) {
			xCount[(X.charAt(i)-48)]++;
		}
		for( int i  = 0 ; i<Y.length() ; i++) {
			yCount[(Y.charAt(i)-48)]++;
		}
		for(int i=9;i>=0;i--) {
			String result="";
			if(yCount[i]!=0&&xCount[i]!=0){
				result+=i;
				result=result.repeat(Math.min(xCount[i], yCount[i]));
			}
			answer.append(result);
		}
		
		if(count == 0) {
			returnn = "-1";
		}else if (answer.charAt(0) == '0') {
			returnn = "0";
		}
	}
}


//
//int n=420;
//HashSet<Integer> num = new HashSet<Integer>();
//int i = 2;
//while(n>=i) {
//	if( n%i==0) {
//		n=n/i;
//		num.add(i);
//		i=2;
//	}else {
//		i++;
//	}
//}
//int[] answer = new int[num.size()];   
//int index = 0;
//Iterator it = num.iterator();
//while( it.hasNext()) {
//	answer[index] = (int) it.next();
//	index++;
//}
//System.out.println(Arrays.toString(answer));
//