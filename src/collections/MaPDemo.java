package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaPDemo {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "hash");
		map.put("actor", "Jo");
		map.put("game", "cricket");
		
		System.out.println(map);
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key +" " +map.get(key));
		}
		
	}

}
