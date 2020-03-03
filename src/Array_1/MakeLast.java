package Array_1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		int[] result = new int[2 * nums.length];
		result[2 * nums.length - 1] = nums[nums.length - 1];
		return result;
	}
}
