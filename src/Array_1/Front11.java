package Array_1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		int[] result1 = new int[1];
		int[] result2 = new int[2];
		if (a.length == 0 && b.length == 0) {
			return a;
		}
		if (a.length == 0) {
			result1[0] = b[0];
			return result1;
		}
		if (b.length == 0) {
			result1[0] = a[0];
			return result1;
		}
		if (a.length > 0 || b.length > 0) {
			result2[0] = a[0];
			result2[1] = b[0];
			return result2;
		}
		return result1;
	}
}
