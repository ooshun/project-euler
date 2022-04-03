
public class Problem045 {
	public static long getT(long n) {
		return n * (n + 1) / 2;
	}

	public static long getP(long n) {
		return n * (3 * n - 1) / 2;
	}

	public static long getH(long n) {
		return n * (2 * n - 1);
	}

	public static boolean isSame(long t, long p, long h) {
		if ((getT(t) == getP(p)) && (getP(p) == getH(h))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		long t = 286;
		long p = 165;
		long h = 143;
		long T = getT(t);
		long P = getP(p);
		long H = getH(h);
		while (!isSame(t, p, h)) {
			if (T < P && P == H) {
				t++;
			} else if (P < H && H == T) {
				p++;
			} else if (H < P && P == T) {
				h++;
			} else if (H < P && T < P) {
				h++;
				t++;
			} else if (P < H && T < H) {
				p++;
				t++;
			} else if (P < T && H < T) {
				p++;
				h++;
			} else {
				System.out.println("P = " + P + " T = " + T + " H = " + H);
			}
//			System.out.println("p = " + p + " t = " + t + " h = " + h);
//			System.out.println("P = " + P + " T = " + T + " H = " + H);
			T = getT(t);
			P = getP(p);
			H = getH(h);
		}
		System.out.println(getT(t));
	}

}
