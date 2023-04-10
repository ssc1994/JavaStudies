package api.util.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionEx {
	
	public static void main(String[] args) {
		 List<Integer> list= new ArrayList<>();
		 Collection<Integer> list2= new ArrayList<>();
		 
		 list2.add(1);
		 list2.add(2);
		 list2.add(3);
		 
		 list.add(1);
		 
		 list.addAll(list2);

		 list2.clear();
		 list2.add(1);
		 list2.add(2);
		 list2.add(3);
		 
		 list.addAll(list2);
		 
		 int a  = list.get(0);		//1
		 int b = list.size();		//4
		 
		 list.forEach(x ->{
			 System.out.println(x);
		 });
		 System.out.println(list);
		 System.out.println("========================================================================");
		 
		 Map<Integer, String> map = new HashMap<>();		//Map은 멀티제너릭 클래스로
		 
		 map.put(1, "a");
		 map.put(2, "b");
		 map.put(3, "c");
		 
		 map.put(3, "jlaskdjflaks");
		 System.out.println(map.toString());
		 
		 String result = map.get(1);	//1번 Key에 대한 값이 나옴  (조회는 Key로 조회함)
		 
		 //맵의 반복			key값과 value값을 세트로 뽑아줌
		 Set<Entry<Integer, String>> ens = map.entrySet();
		 
		 for( Entry<Integer, String> e : ens) {
			 System.out.println(e);
			 System.out.println(e.getKey());
			 System.out.println(e.getValue());
			 System.out.println();
		 }
	}

}
