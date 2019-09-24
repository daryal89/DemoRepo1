package imp_methods;

public class DuplicateElementUsingForLoop {

	static int[] x = { 2, 4, 6, 8, 10, 2, 6, 8, 12 };
	static String[] names = { "mohan", "sohan", "rohan", "milan", "shyam", "mohan", "geeta","Rohan" };

	static void findDuplicate(int[] a) {
		int duplicate;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j] && i != j) {
					duplicate = a[j];
					System.out.println("Duplicate is: " + duplicate);
				}
			}
		}
	}

	
	static void findDuplicateString(String[] a) {
		String duplicate;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (a[i].equalsIgnoreCase(a[j]) && i != j) {
					duplicate = a[i];
					System.out.println("Duplicate is: " + duplicate);
				}
			}
		}
	}

	public static void main(String[] args) {
		findDuplicate(x);
		findDuplicateString(names);

	}

}
