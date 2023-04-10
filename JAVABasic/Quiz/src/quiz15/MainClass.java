package quiz15;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;

		MelonMusic mm = new MelonMusic();
		
		
		while(flag) {
			System.out.println("메뉴 [1.추가, 2.재생, 3.개수, 4.종료]");
			System.out.print(">");
			
			int num = scan.nextInt();
			
			if(num==1) {
				System.out.print("노래 제목 : ");
				String song = scan.next();
				mm.insertList(song);		//노래입력
			}else if(num==2) {
				mm.playList(); 				//랜덤노래 재생
			}else if(num==3) {
				System.out.println("플레이리스트의 노래 개수는 : " + mm.playLength()); 
			}else if(num==4) {
				System.out.println("종료");
				flag = false;
			}
			
		}
		
//		
//		mm.insertList("애국가1절");
//		mm.insertList("애국가2절");
//		mm.insertList("애국가3절");
//		mm.insertList("애국가4절");
//		System.out.println(mm.playLength());
//		mm.playList();
		
	
	}

}
