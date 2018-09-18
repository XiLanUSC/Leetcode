
public class Test300_2 {
	public int lengthOfLIS(int[] nums) {
		int[] maxLens = new int[nums.length];
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j])
					maxLens[i] = Math.max(maxLens[j] + 1, maxLens[i]);
			}
			maxLen = Math.max(maxLen, maxLens[i] + 1);
		}
		return maxLen;
	}
}
