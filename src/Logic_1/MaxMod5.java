package Logic_1;

public class MaxMod5 {
	public int maxMod5(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if (a == b)
			return 0;
		if (a % 5 == b % 5)
			return min;
		return max;
	}
}
