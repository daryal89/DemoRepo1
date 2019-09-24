package imp_methods;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateUsingMap {
	static int[] x = { 2, 4, 6, 8, 10, 2, 6, 8, 12, 2, 6, 12, 10, 14, 15, 16 };
	static String[] names = { "mohan", "sohan", "rohan", "milan", "shyam", "mohan", "geeta", "rohan", "rohan",
			"shyam", };

	static void duplicateString(String[] a) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String st : a) {
			Integer count = hm.get(st);
			if (count == null) {
				hm.put(st, 1);
			} else {
				hm.put(st, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Key: " + entry.getKey() + "  Duplication time: " + entry.getValue());
			}
		}
	}

	static void duplicateInt(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : a) {
			Integer count = map.get(i);
			if (count == null) {
				map.put(i, 1);
			} else {
				map.put(i, ++count);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element: " + entry.getKey() + "  Duplication time: " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		duplicateInt(x);
		duplicateString(names);
	}

}
