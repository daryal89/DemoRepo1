package imp_methods;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementsOfAnArray {

	static int[] a = { 2, 3, 5, 7, 9, 1, 4, 7, 10, 10, 7, 4 };
	static int[] b = { 3, 7, 2, 1, 8, 12, 7, 10, 3, 7, 2 };

	static String[] st = { "ritu", "dhruba", "sangita", "raju", "prakash", "namru" };
	static String[] name = { "ritu", "dhruba", "sangita", "raju", "suju", "kalpana" };

	static void distinctElement(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : a) {
			if (set.add(i) == true) {
				set.add(i);
			}
		}
		System.out.println("Distinct elements are: " + set);

	}

	static void distinctStringElement(String[] a) {
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					s.add(a[j]);

				}

			}
			System.out.println("Distinct elements are: " + a[i]);
		}


	}

	public static void main(String[] args) {
		distinctElement(a);
		distinctElement(b);
		
		distinctStringElement(st);
		distinctStringElement(name);

	}

}
