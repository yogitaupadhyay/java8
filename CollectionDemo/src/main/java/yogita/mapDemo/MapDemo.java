package yogita.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapDemo {
	private static  Map<String, List<Map<Integer, String>>> groupDeltaRecordByRic(List<Map<Integer, String>>fruitList) {
        return fruitList.stream()
                .filter(data -> !Objects.isNull(data.get(1)))
                .collect(Collectors.groupingBy(data ->(String)data.get(1)));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map1=new HashMap<>();
		map1.put(1, "banana");
		map1.put(2, "yello");
		map1.put(3, "fruit");
		map1.put(4, "soft");
		Map<Integer,String>map3=new HashMap<>();
		map3.put(1, "banana");
		map3.put(2, "red");
		map3.put(3, "fruit");
		map3.put(4, "soft");
		
		Map<Integer,String>map2=new HashMap<>();
		map2.put(1, "orange");
		map2.put(2, "orange");
		map2.put(3, "fruit");	
		map2.put(4, "soft");
		
		List<Map<Integer,String>>fruitList=new ArrayList<>();
		fruitList.add(map1);
		fruitList.add(map2);
		List<Map<Integer,String>>delta=new ArrayList<>();
		delta.add(map1);
		delta.add(map2);
		delta.add(map3);
		
//		 fruitList.forEach(fruit->fruit.entrySet().stream().forEach(s -> System.out.println(s)));
		 Map<String, List<Map<Integer, String>>>res=groupDeltaRecordByRic(delta);
		for(String key:res.keySet()) {
			System.out.println(key);
			for(Map<Integer,String>map:res.get(key)) {
				for(Integer data:map.keySet()) {
					System.out.print(data+"  "+map.get(data)+"  ");
				}
				System.out.println();
			}
		}
		 
		 fruitList.forEach(fruit -> res.get(fruit.get(1))
	                .forEach(gropedf -> gropedf.entrySet()
	                        .stream()
	                        .forEach(entry -> fruit.put(entry.getKey(), entry.getValue()))));

		 
		 fruitList.forEach(fruit->fruit.entrySet().stream().forEach(s -> System.out.print(s+"  ")));
	}

}
