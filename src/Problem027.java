public class Problem027 {

	public static int isPrimeArray[];

	public static void calcPrimeArray(int n, int array[]) {
		//既にある場合
		if (isPrimeArray[n] > 0) {
			return;
		}
		//偶数の場合
		if (n % 2 == 0) {
			array[n]++;
			return;
		}
		int k = n;
		//奇数の場合
		for (int i = 3; i < Math.sqrt(n) + 1; i += 2) {
			if (n % i == 0) {
				array[n]++;
				return;
			}
		}
		return;
	}

	public static boolean isPrime(int np) {
		return isPrimeArray[np] == 0;
	}

	public static int calc(int a, int b) {
		int n = 0;
		boolean flag = true;
		while (flag) {
			int tmp = (n * n + a * n + b);
			if (tmp <= 0) {
				break;
			}
			//			System.out.println(tmp + ", " + a + ", " + b + ", " + n);
			if (!isPrime(tmp)) {
				flag = false;
				break;
			}
			n++;
		}
		return n;
	}

	public static void main(String[] args) {
		// make prime array
		int an = 1000 * 1000 * 2 + 2000;
		isPrimeArray = new int[an + 1];
		for (int i = 1; i < an + 1; i++) {
			calcPrimeArray(i, isPrimeArray);
		}
		//		System.out.println(isPrimeArray[1811323]);

		int A = 0;
		int B = 0;
		int max = -1;
		for (int a = -999; a < 1000; a++) {
			for (int b = -1000; b < 1000; b++) {
				int calcn = calc(a, b);
				if (max < calcn) {
					System.out.println(a + ", " + b + ", " + calcn);
					max = calcn;
					A = a;
					B = b;
				}
			}
		}
		System.out.println("answer : " + (A * B));
	}
}
