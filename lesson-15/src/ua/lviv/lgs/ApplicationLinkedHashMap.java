package ua.lviv.lgs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ApplicationLinkedHashMap {
	public static void main(String[] args) {

		Map <String, Integer> map = new LinkedHashMap<>();
		map.put("Andrew", 1);
		map.put("Ban", 2);
		map.put("Clara", 3);
		map.put("Dennis", 4);
		map.put("Eva", 5);

		System.out.println(map);

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}

		System.out.println(map.get("Andrew"));

		System.out.println(map.containsKey("Ban2"));

		System.out.println(map.values());

		System.out.println(map.containsValue(15));

		Map map2 = new HashMap<>();

		map2 = map;
		System.out.println(map.equals(map2));

		System.out.println(map.hashCode());

		System.out.println(map.keySet());

		System.out.println(map.toString());

		System.out.println(map.getOrDefault("Andreew", 99));

		System.out.println(map.remove("Eva"));
		System.out.println(map);

		System.out.println(map.size());

		System.out.println(map.replace("Andrew", null));

		System.out.println(map);

		System.out.println(map.putIfAbsent("Andrew", 1234));
		System.out.println(map);

		map.clear();

		System.out.println(map);
		
	}
}
