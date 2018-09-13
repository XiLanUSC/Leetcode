
public class Test213 {
	public int rob(int[] nums) {
		int len = nums.length;
		int cur = 0;
		if (len == 0)
			return 0;
		if (len == 1)
			return nums[0];
		if (len == 2)
			return Math.max(nums[0], nums[1]);
		if (len == 3)
			return Math.max(nums[2], Math.max(nums[1], nums[0]));
		int[] dp = new int[len];
		boolean[] inc0 = new boolean[len];
		dp[0] = nums[0];
		inc0[0] = true;
		dp[1] = nums[1];
		inc0[1] = false;
		dp[2] = nums[0] + nums[2];
		inc0[2] = true;
		for (int i = 3; i < len-1; i++) {
			dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
			if(dp[i]>cur)cur = dp[i];
		}
		dp[len-1] = 0;
		for(int i = len-3;i>0;i--) {
			if(inc0[i] == false)
				if(dp[i]+nums[len-1]>dp[len-1])
					dp[len-1] = dp[i]+nums[len-1];
		}
		if(dp[len-1]>cur)cur = dp[len-1];

		return cur;
	}
}
//1 10 9 8 7 6 5 4
//       1 1 