import java.math.BigInteger;

public class Problem025 {

	public static void main(String[] args) {

		BigInteger ans_bef = new BigInteger("1");
		BigInteger answer = new BigInteger("1");
		int n = 1000;
		int count = 2;
		while (true) {
			count++;
			BigInteger tmp = answer;
			answer = answer.add(ans_bef);
			ans_bef = tmp;

			String str = answer.toString();
			//			System.out.println(str);
			if (str.length() == n) {
				break;
			}
		}
		System.out.println("answer : " + count);
	}
}
