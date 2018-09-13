
public class Test213_2 {
	public int rob(int[] nums) {
		int len = nums.length;
		if (len == 0)
			return 0;
		if (len == 1)
			return nums[0];
		if (len == 2)
			return Math.max(nums[0], nums[1]);
		int[] temp1 = new int[len];
		int[] temp2 = new int[len];
		for (int i = 0; i < nums.length; i++) {
			temp1[i] = nums[i];
			temp2[i] = nums[i];
		}
		int a = get(temp1, 0, len - 2);
		int b = get(temp2, 1, len - 1);
		return Math.max(a, b);
	}

	private int get(int[] nums, int start, int end) {
		nums[start + 1] = Math.max(nums[start], nums[start + 1]);
		for (int i = start + 2; i <= end; i++) {
			nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
		}
		return nums[end];
	}
}
