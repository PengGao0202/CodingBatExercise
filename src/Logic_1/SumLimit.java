package Logic_1;

public class SumLimit {
	public int sumLimit(int a, int b) {
		if (String.valueOf(a + b).length() > String.valueOf(a).length())
			return a;
		return a + b;
	}
}
