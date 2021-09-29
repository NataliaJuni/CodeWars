package github.codewars;

public class FindOutlier {
	static int find(int[] integers) {
		int mod = Math.abs(integers[0] % 2);
		if (mod != Math.abs(integers[1] % 2))
			;
		if (mod != Math.abs(integers[2] % 2))
			mod = Math.abs(integers[2] % 2);
		for (int e : integers) {
			if (mod != Math.abs(e % 2))
				return e;
		}
		return 0;
	}
}
