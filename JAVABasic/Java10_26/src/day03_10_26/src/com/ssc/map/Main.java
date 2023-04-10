package day03_10_26.src.com.ssc.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		//HashMap 인스턴스 생성
		Map<String,Object> map = new HashMap<>();
		
		//Map에 데이터 저장 = put
		map.put("num", 1);
		map.put("name", "아담");
		map.put("job", "Singer");
		//동일한 Key에 데이터를 저장하면 이전 데이터가 삭제되고 수정됨
		map.put("job", "Cyber Singer");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		
		//존재하지 않는 Key를 사용하면 자바는 null을 리턴
		System.out.println(map.get("age"));
		
		System.out.println(map.keySet());
		System.out.println();
		//MAP을 이용하면 Key의 이름을 몰라도 모든 데이터를 접근하는것이 가능
		Set<String> keys = map.keySet();
		//set을 순회
		for(String key : keys) {
			System.out.println(key + " \t :  "  + map.get(key));
		}
		
		
	}

}
