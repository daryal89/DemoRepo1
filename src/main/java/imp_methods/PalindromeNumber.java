package imp_methods;

public class PalindromeNumber {

	// palindrome number
	static void isPalindrome(int a) {
		int num = a;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		if (a == rev) {
			System.out.println(a + " is a palindrome number");
		} else {
			System.out.println(a + " is not a palindrome number");
		}
	}

	// palindrome word
	static void palindromeString(String a) {
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}

		if (a.equalsIgnoreCase(rev)) {
			System.out.println(a + " : is a palindrome  word");
		} else {
			System.out.println(a + " : is not a palindrome word");
		}
	}

	public static void main(String[] args) {
		isPalindrome(123);
		isPalindrome(121);
		isPalindrome(212);

		palindromeString("RoboR");
		palindromeString("racecaR");
		palindromeString("dad");
		palindromeString("Hello");

	}

}
