package com.ssc.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Main {
	public static void main(String[] args) {

		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//UUID.randomUUID();
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\user\\Desktop\\" + sdf.format(date) + ".bat",true);
			
			//기록할 메세지 생성
			String msg = "msg %username%  HelloWorld \n";
			
			//파일에 기록
			fos.write(msg.getBytes());
		
			//파일 닫기
			fos.close();
		} catch (Exception e) {
			//어떤 문제로 실패했는지 출력
			System.out.println(e.getLocalizedMessage());
		
		
		}
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\2022-10-27.bat");
			//읽어서 저장할 바이트 배열 생성
			byte [] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인
			System.out.println(new String(b));
			System.out.println(Arrays.toString(b));
			
			fis.close();
			
		} catch (Exception e) {
			//어떤 문제로 실패했는지 출력
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
