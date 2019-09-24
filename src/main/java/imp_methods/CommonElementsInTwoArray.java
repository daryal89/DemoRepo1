package imp_methods;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArray {
	static int[] a = { 2, 3, 5, 7, 9, 1, 4, 7, 10 };
	static int[] b = { 3, 7, 2, 1, 8, 12, 7, 10 };

	static String[] st = { "ritu", "dhruba", "sangita", "raju", "prakash", "namru" };
	static String[] name = { "ritu", "dhruba", "sangita", "raju", "suju", "kalpana" };

	static void common(int[] a, int[] b) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(b[j]);
				}
			}
		}
		System.out.println("The common elements are: " + set);
	}

	static void commonString(String[] a, String[] b) {
		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equalsIgnoreCase(b[j])) {
					hs.add(b[j]);
				}
			}
		}
		System.out.println("Common elements are: " + hs);
	}

	public static void main(String[] args) {
		common(a, b);
		commonString(st, name);

	}

}
