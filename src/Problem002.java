
import java.util.HashMap;
import java.util.Map;

public class Problem002 {

	//	public static int fib(int n) {
	//		if (n == 1 || n == 2) {
	//			return n;
	//		} else {
	//			return fib(n - 1) + fib(n - 2);
	//		}
	//	}
	//
	//	public static void main(String[] args) {
	//		int sum = 0;
	//		for (int i = 2; i <= 4000000; i += 3) {
	//			sum += fib(i);
	//		}
	//		System.out.println(sum);
	//	}

	// 2x2の行列を，int[][]で表す.
	//	private static int[][] matmult2x2(int[][] a, int[][] b) {
	//		int[][] result = {
	//				{ (a[0][0] * b[0][0] + a[0][1] * b[1][0]),
	//						(a[0][0] * b[0][1] + a[0][1] * b[1][1]) },
	//				{ (a[1][0] * b[0][0] + a[1][1] * b[1][0]),
	//						(a[1][0] * b[0][1] + a[1][1] * b[1][1]) } };
	//		return result;
	//	}
	//
	//	private static int[][] pow(int n, int[][] a, int[][] m) {
	//		// 引数は，n, 行列 A, 行列 M if (n == 0) {
	//		if (n == 0) {
	//			return m;
	//		} else if (n % 2 == 1) {
	//			return pow(n / 2, matmult2x2(a, a), matmult2x2(m, a));
	//		} else {
	//			return pow(n / 2, matmult2x2(a, a), m);
	//		}
	//	}
	//
	//	public static int fib(int n) {
	//		int[][] a = { { 1, 1 }, { 1, 0 } }, m = { { 1, 0 }, { 0, 1 } };
	//		return pow(n, a, m)[0][0];
	//	}
	//
	//	public static void main(String[] args) {
	//		int n = Integer.parseInt(args[0]);
	//		long start = System.nanoTime();
	//		long sum = 0;
	//		for (int i = 2; i <= n; i += 3) {
	//			sum += fib(n);
	//		}
	//		long end = System.nanoTime();
	//		System.out.println("fib(" + n + ") mod 10000 = " + sum);
	//		System.out.println((end - start) / 1000 + "us");
	//	}
	static long sum = 0;
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	static int fib(int n) {
		if (n < 2) {
			return 1;
		} else if (map.containsKey(n)) {
			return map.get(n);
		} else {
			int result = (fib(n - 1) + fib(n - 2));
			map.put(n, result);
			return map.get(n);
		}
	}

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = Integer.parseInt(args[0]);
		long start = System.nanoTime();
		for (int i = 2; i <= n; i += 3) {
			int value = fib(i);
			if (value > n) {
				break;
			}
			sum += value;
		}
		long end = System.nanoTime();
		System.out.println("fib(" + n + ") = " + sum);
		System.out.println((end - start) / 1000 + "us");
	}
}
