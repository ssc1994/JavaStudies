package day03_10_26.src.com.ssc.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	
	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null 이 리턴됨
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티를 저장함
		properties.setProperty("아담", "한국 최초의 사이버가수 ");
		properties.setProperty("강진 축구", "세계 최초의 온라인 축구 게임 ");
		properties.setProperty("프리스톤테일", "한국 최초의 자체 3D엔진 MMORPG ");
		
		//텍스트 파일로 저장
		try {
			properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myproject.xml"), "xml로 저장");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
