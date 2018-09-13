
public class Test209 {
	public int minSubArrayLen(int s, int[] nums) {
		int i = 0, j = 0, min = Integer.MAX_VALUE;
		int len = nums.length;
		int sum = 0;
		while (j < len) {
			sum += nums[j];
			if (sum >= s) {
				while (sum >= s) {
					sum -= nums[i++];
				}
				if (j - i + 2 <= min)
					min = j - i + 2;
			}
			j++;
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
