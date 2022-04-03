/*The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?*/

public class Problem012 {

	public static boolean isOver500(int array[]) {
		int pow = 1;
		for (int i = 1; i < array.length; i++) {
			pow *= array[i] + 1;
		}
		//		System.out.println("result n=" + (array.length - 1) + " " + pow + ".");
		if (pow > 500) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] primeFactorization(int n, int array[]) {
		while (n % 2 == 0) {
			n /= 2;
			array[2]++;
		}
		int k = n;
		for (int i = 3; i < Math.sqrt(n) + 1; i += 2) {
			while (n % i == 0) {
				array[i]++;
				n /= i;
			}
		}
		if (n != 1) {
			array[n]++;
		}
		return array;
	}

	public static int trial(int n) {
		return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		int n = 0;
		int[] array;
		int result = n;
		array = new int[2];
		array[0] = 0;
		array[1] = 0;
		while (isOver500(array) == false) {

			n++;
			result = trial(n);
			array = new int[result + 1];
			for (int i = 0; i < array.length; i++) {
				array[i] = 0;
			}
			array = primeFactorization(result, array);
		}

		System.out.println(result + " ");
		System.out.println("A");

	}
}
