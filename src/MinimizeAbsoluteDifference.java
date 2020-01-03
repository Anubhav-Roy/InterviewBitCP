import java.util.ArrayList;

public class MinimizeAbsoluteDifference {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();
		ArrayList<Integer> z = new ArrayList<>();

		int[] a = { 2, 4, 6, 9 };
		for (int i = 0; i < a.length; i++) {
			x.add(a[i]);
		}

		int[] b = { 1, 3, 3 };
		for (int i = 0; i < b.length; i++) {
			y.add(b[i]);
		}

		int[] c = { 4, 7 };
		for (int i = 0; i < c.length; i++) {
			z.add(c[i]);
		}

		System.out.println(solve(x, y, z));

	}

	public static int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {

		int minAbsValue = outputCalculator(A.get(0), B.get(0), C.get(0));
		int i = 0, j = 0, k = 0;
		while (i < A.size() && j < B.size() && k < C.size()) {
			if (A.get(i) == B.get(j) && B.get(j) == C.get(k))
				return 0;

			int result = outputCalculator(A.get(i), B.get(j), C.get(k));

			if (result < minAbsValue) {
				minAbsValue = result;
			}

			if (A.get(i) <= B.get(j) && A.get(i) <= C.get(k)) {
				i++;
			} else if (B.get(j) <= A.get(i) && B.get(j) <= C.get(k)) {
				j++;
			} else if (C.get(k) <= A.get(i) && C.get(k) <= B.get(j)) {
				k++;
			}

		}

		return minAbsValue;
	}

	public static int outputCalculator(int a, int b, int c) {
		int min = 0;
		int max = 0;
		if (a >= b && a >= c)
			max = a;
		else if (b >= a && b >= c)
			max = b;
		else if (c >= a && c >= b)
			max = c;

		if (a <= b && a <= c)
			min = a;
		else if (b <= a && b <= c)
			min = b;
		else if (c <= a && c <= b)
			min = c;

		return Math.abs(max - min);
	}

}
