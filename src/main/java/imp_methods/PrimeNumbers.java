package imp_methods;

public class PrimeNumbers {

	static boolean isPrimeNumber(int a) {

		if (a <= 1) {
			return false; // Not a prime number
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false; // not a prime number
			} else
				return true;
		}
		return true;

	}

	public static void main(String[] args) {
		
		isPrimeNumber(0);
		isPrimeNumber(1);
		isPrimeNumber(2);
		isPrimeNumber(3);
		isPrimeNumber(4);
		isPrimeNumber(5);
		isPrimeNumber(26);
		
		System.out.println(isPrimeNumber(0));//false
		System.out.println(isPrimeNumber(1));//false
		System.out.println(isPrimeNumber(2));//true
		System.out.println(isPrimeNumber(3));//true
		System.out.println(isPrimeNumber(4));//false
		System.out.println(isPrimeNumber(5));//true
		System.out.println(isPrimeNumber(26)); //false 

	}

}
