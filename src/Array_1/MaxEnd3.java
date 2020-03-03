package Array_1;

public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		int[] result = new int[3];
		for (int i = 0; i < 3; i++) {
			result[i] = Math.max(nums[0], nums[2]);
		}
		return result;
	}
}
