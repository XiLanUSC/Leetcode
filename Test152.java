
public class Test152 {
	public int maxProduct(int[] nums) {
		if (nums.length == 0)
			return 0;

		int max = nums[0];
		int min = nums[0];
		int rs = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			int maxprod = max*nums[i];
			int minprod = min*nums[i];
			max = Math.max(Math.max(maxprod, minprod),nums[i]);
			min = Math.min(Math.min(maxprod, minprod), nums[i]);
			if(max>rs)rs = max;
		}
		return rs;
	}
}
