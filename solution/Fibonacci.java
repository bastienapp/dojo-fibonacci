class Fibonacci {

	public static int fibo(int n) {
		if (n <= 1) {
			return n; // fibo(0) == 0 et fibo(1) == 1
		}
		int n1 = 0;
		int n2 = 1;
		int tmp;

		for (int i = 1; i < n; i++) {
			tmp = n2;
			n2 += n1;
			n1 = tmp;
		}

		return n2;
	}

	public static int fiboRec(int n) {
		if (n <= 1) {
			return n; // fibo(0) == 0 et fibo(1) == 1
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}