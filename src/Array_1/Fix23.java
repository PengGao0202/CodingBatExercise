package Array_1;

public class Fix23 {
	public int[] fix23(int[] nums) {
		for (int i = 0; i <= 1; i++) {
			if ((nums[i] == 2) && (nums[i + 1] == 3))
				nums[i + 1] = 0;
		}
		return nums;
	}
}
