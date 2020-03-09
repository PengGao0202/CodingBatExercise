package Array_1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		int[] arr = new int[2];
		arr[0] = nums[nums.length / 2 - 1];
		arr[1] = nums[nums.length / 2];
		return arr;
	}
}
