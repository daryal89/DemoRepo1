package imp_methods;

import java.util.HashSet;

public class DuplicateUsingSet {

	static int[] x = { 2, 4, 6, 8, 10, 2, 6, 8, 12 };
	static String[] names = { "mohan", "sohan", "rohan", "milan", "shyam", "mohan", "geeta", "Rohan" ,"rohan"};

	// finding duplicate

	static void duplicateInt(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : a) {
			if (set.add(i) == false) {
				System.out.println("duplicate is: " + i);
			}
		}
	}

	static void duplicateString(String[] a) {
		HashSet<String> hs = new HashSet<String>();

		for (String st : a) {
			if (hs.add(st) == false) {
				System.out.println("Duplicate element is:"+st);
			}
		}
	}

	public static void main(String[] args) {

		duplicateInt(x);
		duplicateString(names);

	}

}
