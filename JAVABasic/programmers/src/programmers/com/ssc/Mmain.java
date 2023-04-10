package programmers.com.ssc;

import java.util.*;

class Mmain {
    public static String solution(String X, String Y) {
      
        String answer = "";
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        int count =0;
        System.out.println((int) X.charAt(0) -48);
        for(int i = 0; i < X.length(); i++) {
           xCount[(int)(X.charAt(i)-'0')]++;
        }
        System.out.println(Arrays.toString(xCount));
        
        for(int i = 0; i < Y.length(); i++) {
           yCount[(int)(Y.charAt(i)-'0')]++;
        }
        System.out.println(Arrays.toString(yCount));
        
        for(int i = 9; i >= 0; i--) {
           String result ="";
           if((yCount[i] == 0 || xCount[i] == 0)) {
              continue;
           }else {
              if( xCount[i] == yCount[i]) {
                 count++;
                 result += i;
                 result = result.repeat(xCount[i]);
              }else {
                 count++;
                  result += i;
                  result = result.repeat(Math.min(xCount[i], yCount[i]));
              }
           }
           answer += result;
        }
        
        if(count == 0) {
           answer = "-1";
        }else {
           if(answer.charAt(0) == '0') {
               answer = "0";
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
      String x = "100";
      String y = "123450";
      System.out.println(solution(x,y));
   }

}