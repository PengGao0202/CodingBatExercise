package Array_1;

public class Start1 {
	public int start1(int[] a, int[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1)
				count++;
		}
		for (int j = 0; j < b.length; j++) {
			if (b[j] == 1)
				count++;
		}
		return count;
	}
}
