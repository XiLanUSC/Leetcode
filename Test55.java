
public class Test55 {
	public boolean canJump(int[] nums) {
		int canreach = nums.length - 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= canreach)
				canreach = i;
		}
		if (canreach == 0)
			return true;
		else
			return false;
	}
}
