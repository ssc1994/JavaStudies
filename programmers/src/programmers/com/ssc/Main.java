package programmers.com.ssc;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("바꿀 Auth_id : >"); 
		int auth_id = scan.nextInt();
		System.out.print("Name : >"); 
		String name = scan.nextLine();
		System.out.print("job : >"); 
		String job = scan.next();
		System.out.println(auth_id);
		System.out.println(name);
		System.out.println(job);
		
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2  = {30, 1, 21, 17, 28};
//		
//		for( int i = 0 ; i < arr1.length ; i ++) {
//			String a = Integer.toBinaryString(arr1[i]);
//			System.out.println(a);
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		
//		for( int i = 0 ; i< arr2.length ; i++) {
//			String a = Integer.toBinaryString(arr2[i]);
//			System.out.printf(String.format("%s",a));
//			System.out.println();
//		}
		
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