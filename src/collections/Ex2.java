package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(89);
		values.add(67);
		values.add(4);
		values.add(3);
		values.add(3, 7);
		
		Collections.sort(values);
		
		values.forEach(System.out::println); // Stream API - Lambda expression
		
//		for(int i : values) {
//			System.out.println(i);
//		}
		
	}

}
