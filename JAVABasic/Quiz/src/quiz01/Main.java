package quiz01;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String s = "()(())(()())";
		String[] arr = s.split("");
		boolean answer = true;
		String l = "(";
		String r = ")";
		int lcount = 0;
		int rcount = 0;

		if(s.charAt(0)==')') answer=false;

		Queue q = new LinkedList<>();
		for(int i = 0 ; i < arr.length ; i++) {
			q.add(arr[i]);

		}
		for( int i = 0 ; i<arr.length ; i++) {
			System.out.println(q);
			if(lcount-rcount>=0) {
				if(q.peek().equals(l)) {
					lcount++;
					q.remove();
				}else if(q.peek().equals(r)) {
					rcount++;
					q.remove();
				}
			}
		}
		if( q.isEmpty())  answer = true;
		if( lcount != rcount) answer = false;

		System.out.println(answer);
		//        return answer;

	}
}
//		String s = "3people   unFollowed   me";
//		
//		String[] str = s.split(" ");
//		String answer = "";
//		for(int i = 0 ; i<str.length ; i++) {
//			String[] str2 = str[i].split("");
//			for( int j = 0 ; j<str2.length ; j++) {
//				
//				str2[j] = str2[j].trim().toLowerCase();
//				str2[0] = str2[0].toUpperCase();
//				if(str2[j]!= " ")
//				answer +=str2[j];
//			}
//			if(i<str.length-1) answer+= " ";
//		}
//		if( s.charAt(s.lastIndexOf(s)) == ' ') answer+= " ";
//		answer = answer.replaceAll("\s{2,}"," ");
//	        
//	    System.out.println(answer);



//		int[] arr = {4,0,2,3,0};
//		int a = arr.length;
//		int min = arr[0];
//		if( a==1) a++;
//		int[] answer = new int[a-1];
//		for(int i = 0 ; i < arr.length-1 ; i++) {
//			for( int j = i+1 ; j < arr.length ; j++) {
//				
//				if(min > Math.min(arr[i], arr[j])) {
//					min = Math.min(arr[i], arr[j]);
//				}
//			}
//		}
////		for( int i = 0 ; i<arr.length ; i++) {
////			
////			if(min>arr[i]) {
////				min = arr[i];
////			}
////		}
//		
//		System.out.println(min);
//		int i = 0 ;
//		int j = 0 ;
//		while(j<arr.length) {
//			if(arr[j] != min) {
//				answer[i] = arr[j];
//				i++;
//			}
//			j++;
//		}
//		
//		
//		if(arr.length == 1){
//            answer[0] = -1;
//        }
//		
//		System.out.println(Arrays.toString(answer));
//		
//		


//		answer = l+m+s;

//		
//		String s = "try h ";
//		String answer = "";
//		String[] ans = s.trim().split(" ");
//		char s1;
//		for ( int i = 0 ; i<ans.length ; i++) {
//			String sb = ans[i];
//			for(int j = 0 ; j < sb.length() ; j++) {
//				if( j%2==0) {
//					answer+=String.valueOf(sb.charAt(j)).toUpperCase();
//					
//				}else {
//					answer+=sb.charAt(j);
//				}
//				if(j==sb.length()-1&&i!=ans.length-1) answer+=" ";
//			}
//			
//		}
//		System.out.println(answer);



//		String[] quiz = {"19 - -6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
//		String[] answer = new String[quiz.length];
//		int first = 0;
//		int second = 0;
//		int result = 0;
//		
//		
//		for(int i =  0 ; i<quiz.length; i++) {
//			String[] arr = quiz[i].split(" ");
//			first = Integer.parseInt(arr[0]);
//			second = Integer.parseInt(arr[2]);
//			result = Integer.parseInt(arr[4]);
//			
//			if(arr[1].equals("+")) {
//				if(first+second==result) {
//					answer[i]="O";
//				}else {
//					answer[i]="X";
//				}
//			}else {
//				if(first-second==result) {
//					answer[i]="O";
//				}else {
//					answer[i]="X";
//				}
//				
//			}
//			
//		}

//quiz에 들어간 값 수 만큼 실행
//		for( int i = 0 ; i<quiz.length ; i++) {
//
//			String quizz = quiz[i].replaceAll(" ", "");
//			StringBuffer sb = new StringBuffer(quizz);
//			int length = sb.length();	//길이
//			int equal = sb.indexOf("=");	//=의 인덱스값 +1 하면 결과값
//			int result = Integer.parseInt(sb.substring(equal+1));	//값
//			int plus = sb.indexOf("+");		//없으면 -1을 리턴		위치가 -1이 아닐때 실행
//			int minu = sb.indexOf("-");		//없으면 -1을 리턴		위치가 -1이 아닐때 실행
//			
//			if(plus>0) {
//				int plu1 = Integer.parseInt(sb.substring(0, plus));
//				int plu2 = Integer.parseInt(sb.substring(plus,equal));
//				
//				if(result == plu1+plu2) {
//					answer[i] = "O";
//				}else {
//					answer[i] = "X";
//				}
//				
//			}else {
//				int min1 = Integer.parseInt(sb.substring(0, minu));
//				int min2 = Integer.parseInt(sb.substring(minu+1,equal));
//
//				if(result == min1-min2) {
//					answer[i] = "O";
//				}else {
//					answer[i] = "X";
//				}
//			}
//
//		}



//		String answer = "abcabcadc";
//		char[] arr = answer.toCharArray();
//		Arrays.sort(arr);
//		answer = String.valueOf(arr);
//		answer = answer.replaceAll("(([a-z])\\2{1,})", "");
//		System.out.println(answer);


//		
//		
//		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//	    double[] ave = new double[score.length];
//	    int[] answer = new int [score.length];
//	    
//	    for (int i = 0 ; i<score.length ; i++) {
//	    	for(int j = 0 ; j<score[i].length ; j++) {
//	    		ave[i] +=(double)score[i][j];
//	    	}
//	    	ave[i]/=2;
//	    }
//	    double max = ave[0];
//	    int count =0;
//	    for( int i = 0 ; i < ave.length ; i++) {
//	    	count=1;
//	    	for(int j = 0 ; j < ave.length ; j ++) {
//	    		if(ave[i]<ave[j]) count++;
//	    	}
//	    	answer[i] = count;
//	    }
//	    
//	    System.out.println(Arrays.toString(ave));
//	    System.out.println(Arrays.toString(answer));
//	    System.err.println(count);
//		
//	


//		while(num!=1 && count<500) {
////
//			if( num%2==0) {
//				num/=2;
//			}else if(num%2!=0&&num!=1) {
//				num=(num*3)+1;
//			}
//			count++;
//			System.out.println(num);
//
//		}
//		
//		if( count>=500){
//            answer = -1;
//        }else{
//            answer = count;
//        }        
//		System.out.println(count);
//	

//		int chicken = 1999;
//		int answer = 0;
//		int na = 0;
//		while(chicken>0) {
//			answer+=chicken/10;		//199
//			na+=chicken%10;			//9
//			if(na>=10) {			//
//				answer++;			//
//				na-=10;				//
//			}
//			chicken/=10;			//199
//		}
//		System.out.println(chicken);
//		System.out.println(answer);
//		System.out.println(na);


//		
//		String my_string = "We are the world";
//		String answer = "";
//		String[] str = my_string.split("");
//
//		int count=0;
//		for(int i = 0 ; i<str.length ; i++) {
//			for( int j = i+1 ; j<str.length-1 ; j++) {
//				if(str[i].equals(str[j])) {
//					str[j]="";
//				}
//			}
//		}
//		
//		for(int i = 0 ; i < str.length-count ; i++) {
//			answer+=str[i];
//		}

//		int order = 29423;
//		int[] board = {7,9};
//		int answer = 0;
//        char[] arr = Integer.toString(order).toCharArray();
//        for (int i = 0; i<arr.length ; i++) {
//        	if( arr[i]== '3' || arr[i]=='6' || arr[i] == '9') {
//        		answer++;
//        	}
//        }
//		int n = 20;
//	    int newNum = 0;
//
//
//			for(int i = 1; i<=n ; i++) {
//				if(newNum%3==0 || String.valueOf(newNum).contains("3"))  {i--;}
//				newNum++;	
//				}
//				
//			System.out.println(newNum);
//			}
//		

//		int n = 15;
//		int newNum = 0;
//
//
//		for(int i = 1; i<=n ; i++) {
//			newNum++;
//			if(newNum%3==0 || Integer.toString(newNum).contains("3")) i--;
//
//		}
//		System.out.println(newNum);

//		
//		int n = 20; //입력받은 변수
//		int newNum = -1;
////		int i = 0;
//
//		for(int i = 1; i<=n ; i++) {
//			if(newNum%3==0) {
//				newNum++;
//				i--;
//			}else if(Integer.toString(newNum).contains("3")) {
//				newNum++;
//				i--;
//			}else{
//				newNum++;
//				
//			}
//			
//		}

//		answer = newNum-1;


//		num : while(i<n){
//			
//			if(newNum%3==0) {
//				newNum++;
//				continue num;
//			}else if(Integer.toString(i).matches("3")) {
//				newNum++;
//				continue num;
//			}else{
//				newNum++;
//				i++;
//			}

//	}
//		int[] array = {1, 2, 3,3,3,4,5};
//
//		//		int answer = 0;
//		int num = 0;		//자주나오는 숫자
//		int max = 0;       	//가장 자주 나오는 숫자 카운트 저장용
//		int count = 0;		//카운트하는 변수
//		int[] array2 = new int[array.length];	//카운트 저장용 배열
//		
//		for (int i = 0; i<array.length; i++) {
//			count =0;
//			for(int j = 0 ; j < array.length; j++) {
//				if(array[i] == array[j]) {
//					count++;
//				}
//				if(count > max) {
//					max=count;
//					num=array[i];
//				}
//			}
//			array2[i] = count;
//		}
//		count=0;
//		for(int i = 0; i< array2.length ; i++) {
//			if(array2[i]==max) {
//				count++;
//			}
//		}
//		if( count>max) {
////			return -1;
//		}
//		System.out.println(num);
//		System.out.println(max);
//		System.out.println(count);
//		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(array2));


//	
//		String id = "...!@BaT#*..y.abcdefghijklm";
//		
////		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//		id=id.toLowerCase();	//str.toLowerCase()를 사용해서 소문자로 치환
////		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//		String match = "[^a-z0-9-_.]";		//^a-z = a를 제외한 문자들
//		id=id.replaceAll(match, "");
////		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//		String match2 = "[.]{2,}";			//[.]이 n번'이상' 연속된걸 없애려면 쉼표를 찍어야한다 {n,} 
//		id=id.replaceAll(match2, ".");
//		
////		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//		String match3 = "^[.]|[.]$";		//^[.] = 맨 앞에 위치한 [.] // [.]$ = 맨뒤에 위치한 [.]			
//		id=id.replaceAll(match3, "");
//		
////		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//		if(id.equals("")) {		//id가 공백이라면 문자열인 id에 a를 더함
//			id+="a";
//		}
//		
////		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
////		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//		if(id.length()>=16) {
//			id=id.substring(0, 15).replaceAll("[.]$", "");	//0~15 인덱스에 위치한 문자열을 잘라내기한뒤 맨뒤에문자가 [.]이면 공백으로 바꿈
//		}
//		
//		
////		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
//		while(id.length()<3) {						//id의 길이가 3일될때까지
//			id+=id.substring(id.length()-1);		//id에 id 맨 마지막 -1 인덱스에 위치한 문자를 더함
//		}
//		System.out.println(id);

//}
