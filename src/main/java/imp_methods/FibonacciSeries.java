package imp_methods;

public class FibonacciSeries {

	static void fibonacciSeries(int a) {
		int sum;
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");

		for (int i = 2; i <= a; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		fibonacciSeries(5);
		fibonacciSeries(10);
		fibonacciSeries(15);

	}

}
