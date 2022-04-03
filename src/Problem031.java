
public class Problem031 {

	public static boolean isTwoPound(int coins[], int count[]) {

		int len = coins.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += coins[i] * count[i];
		}

		if (sum == 200) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int max[] = { 200, 100, 40, 20, 10, 4, 2, 1 };
		int len = coins.length;
		int tc = 0;

		int count[] = new int[len];

		for (int i = 0; i < len; i++) {

		}

		if (isTwoPound(coins, count) == true) {
			tc++;
		}
		System.out.println(tc);
	}
}
