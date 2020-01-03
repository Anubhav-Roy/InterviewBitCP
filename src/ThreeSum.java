import java.util.ArrayList;
import java.util.Collections;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<>();

		int[] a = { 5, -2, -1, -10, 10 };

		for (int i = 0; i < a.length; i++) {
			x.add(a[i]);
		}

		System.out.println(threeSumClosest(x, 5));
	}

	public static int threeSumClosest(ArrayList<Integer> A, int B) {

		Collections.sort(A);

		int closestSum = A.get(0) + A.get(1) + A.get(A.size() - 1);
		int i = 0, j = 1, k = A.size() - 1;
		while (i < A.size() && j < A.size() && k >= 0) {
			int result = (A.get(i) + A.get(j) + A.get(k));

			if (Math.abs(B - result) < Math.abs(B - closestSum)) {
				closestSum = result;
			}

			if (result < B) {

				if (j + 1 < k)
					j++;
				else {

					if (i <= k - 2) {
						i++;
						j = i + 1;
						k = A.size() - 1;
					} else
						break;
				}
			} else if (result > B) {

				if (k - 1 > j)
					k--;
				else {
					if (i <= k - 2) {
						i++;
						j = i + 1;
						k = A.size() - 1;
					} else
						break;
				}

			} else
				return B;

		}

		return closestSum;
	}

}
