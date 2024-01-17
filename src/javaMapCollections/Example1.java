package javaMapCollections;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		
		Map<String, Integer> mapList = new HashMap<String, Integer>();//16 => 0 - 15
		
		mapList.put("Ajay", 101);
		mapList.put("Kiran", 123);
		mapList.put("Arun", 111);
		mapList.put("Lalit", 107);
		mapList.put("Ram", 109);
		mapList.put(null, 123);
		mapList.put("Harish", 171);
		mapList.put("Ajay", 221);
		mapList.put("A5", null);
		mapList.put("Jaya", 112);
		mapList.put(null, 200);
		mapList.put(null, 500);
		mapList.put("A2", null);
		
		for(Map.Entry<String, Integer> entry: mapList.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}

	}

}
