
public class Test53 {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;
		int rs = nums[0];
		int cur = nums[0];
		for (int i = 1; i < nums.length; i++) {
			cur = Math.max(cur + nums[i], nums[i]);
			rs = Math.max(rs, cur);
		}
		return rs;
	}

}
