package quiz10;

import java.util.Arrays;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 20, 123123 )을 저장 하고 값을 확인하세요.
		 */


		Scanner scan = new Scanner(System.in);
		
		User ur = new User("홍길동", 20, 123123);
		String name = ur.getName();
		int age = ur.getAge();
		int rrn = ur.getRrn();
		System.out.println("이름 "+ name + ", 나이 : "+ age + ", 주민번호 : " + rrn);
		System.out.println("================================");
		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 30, rrn값)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2];
		 */

		User[] arr = new User[2];
		
		User ur2 = new User("김길동",30,12345);
		String name2 = ur2.getName();
		int age2 = ur2.getAge();
		int rrn2 = ur2.getRrn();
		
		arr[0] = ur;
		arr[1] = ur2;
		for(User s : arr) {
			System.out.println("이름 : " + s.getName());
			System.out.println("나이 : " + s.getAge());
			System.out.println("주민번호 : " + s.getRrn());
		}
		
//		향상된 for문이 아닌 일반 for문으로도 작성 가능하다. 
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("이름 : " + arr[i].getName());
//			System.out.println("이름 : " + arr[i].getAge());
//			System.out.println("이름 : " + arr[i].getRrn());
//		}
		
		
		System.out.println("================================");

		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] farr = new User[5];
		int i = 0;
		while(i<5) {
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("주민번호 : ");
			rrn = scan.nextInt();
			System.out.print("나이 : ");
			age = scan.nextInt();
			
			User fur = new User(name,age,rrn);
			farr[i] = fur;
			i++;
			System.out.println(Arrays.toString(farr));
		}
		
		for(User s : farr) {
			System.out.println("이름 : " + s.getName());
			System.out.println("주민번호 : " + s.getRrn());
			System.out.println("나이 : " + s.getAge());
		}
		
		System.out.println("================================");
		
		
		
	}
}
