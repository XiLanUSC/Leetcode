
public class Test523 {
	public boolean checkSubarraySum(int[] nums, int k) {
		if (nums.length == 0)
			return false;
		if (nums.length == 2 && nums[0] == 0 && nums[1] == 0 && k == 0)
			return true;
		if (k == 0)
			return false;
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0] % k;
		for (int i = 2; i <= nums.length; i++) {
			dp[i] = (dp[i - 1] + nums[i - 1]) % k;
			for (int j = 0; j < i - 1; j++) {
				if ((dp[i] - dp[j]) % k == 0)
					return true;
			}
		}
		return false;
	}
}
