package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Ex1 {
	public static void main(String[] args) {
		
//		Collection values = new ArrayList();
//		values.add(78);
//		values.add("Test");
//		values.add(6);
//		
//		for(Object i : values) {
//			System.out.println(i);
//		}
//		
		
		Collection<Integer> values = new ArrayList<>();
		values.add(67);
		values.add(6);
		values.add(90);
		values.remove(90);
		
		for(int i : values) {
			System.out.println(i);
		}
		
	}

}
