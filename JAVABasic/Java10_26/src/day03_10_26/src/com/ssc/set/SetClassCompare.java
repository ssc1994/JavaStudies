package day03_10_26.src.com.ssc.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	public static void main(String[] args) {
		//문자열을 저장하는 Set인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedhashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		hashSet.add("LG EDS");
		linkedhashSet.add("LG EDS");
		treeSet.add("LG EDS");
		
		hashSet.add("SS SDS");
		linkedhashSet.add("SS SDS");
		treeSet.add("SS SDS");
		
		hashSet.add("29");
		linkedhashSet.add("29");
		treeSet.add("29");
		
		hashSet.add("Tree");
		linkedhashSet.add("Tree");
		treeSet.add("Tree");

		hashSet.add("Grape");
		linkedhashSet.add("Grape");
		treeSet.add("Grape");
		
		hashSet.add("KB");
		linkedhashSet.add("KB");
		treeSet.add("KB");
		
		hashSet.add("KAKAO");
		linkedhashSet.add("KAKAO");
		treeSet.add("KAKAO");
		
		hashSet.add("25");
		linkedhashSet.add("25");
		treeSet.add("25");
		
		
		//출력
		//HashSet : 알수가없음
		for(String company : hashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
		//LinkedhashSet : 저장한 순서대로 출력
		for(String company : linkedhashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
		//treeSet
		for(String company : treeSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
	}

}
