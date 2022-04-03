import java.math.BigInteger;

public class Problem048 {
	public static void main(String[] args) {
		int n = 1000;
		BigInteger modulo = new BigInteger("10000000000");
		BigInteger answer = new BigInteger("0");
		for (int i = 1; i <= n; i++) {
			String str = Integer.toString(i);
			BigInteger ans = new BigInteger(str);
			for (int j = 0; j < i - 1; j++) {

				ans = ans.multiply(BigInteger.valueOf(i));
				ans = ans.mod(modulo);
				//				System.out.println("i=" + i + "j=" + j + "ans" + ans);
			}

			answer = answer.add(ans);
			answer = answer.mod(modulo);
		}
		System.out.println(answer);
	}
}
