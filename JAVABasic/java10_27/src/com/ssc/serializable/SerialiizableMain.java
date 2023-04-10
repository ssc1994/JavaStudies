package com.ssc.serializable;

import java.util.*;
import java.io.*;

public class SerialiizableMain {
	public static void main(String[] args) {
		try(/*인스턴스 단위에 파일에 기록할 수 있는 객체를 생성*/
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("multiobject.txt"))
			) {
			
			//기록할 인스턴스를 생성
			StudentDTO dto1 = new StudentDTO(1,"아담",new Date());
			StudentDTO dto2 = new StudentDTO(2,"강진축구",new Date());
			
			//기록할 인스턴스가 여러개면 하나의 list로 묶어준다
			ArrayList<StudentDTO> list = 
					new ArrayList<>();
			//리스트에 데이터 추가
			list.add(dto1);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
			
			//종료
//			oos.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	
		try(//인스턴스 단위에 파일에 기록할 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("multiobject.txt"))
			) {
			
			//기록을 할 때 List를 사용했으면 읽어올때도 List로 읽어야한다
			ArrayList list = (ArrayList) ois.readObject();

			for(Object obj : list) {
				System.out.println(obj);
			}
			//종료
//			ois.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
	

}
