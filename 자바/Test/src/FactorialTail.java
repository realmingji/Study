
public class FactorialTail {
	public static int factorialTail(int n, int acc) {
		if (n == 1) {
			return acc;
		}
		else {
			return factorialTail(n-1, acc * n);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialTail(1000000,1));
	}

}
