package javaMapCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example5 {

	public static void main(String[] args) {

		Map<String, Integer> mapList = new ConcurrentHashMap<String, Integer>();

		mapList.put("Ajay", 101);
		mapList.put("Kiran", 123);
		mapList.put("Arun", 111);
		mapList.put("Lalit", 107);
		mapList.put("Ram", 109);
		mapList.put("Harish", 171);
		mapList.put("Ajay", 221);
		mapList.put("Jaya", 112);	
		
		mapList.putIfAbsent("Ganesh", 898);
		
		mapList.remove("Ajay");
		
		System.out.println(mapList);
		
		

	}

}
