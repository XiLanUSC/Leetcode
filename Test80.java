
public class Test80 {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int len = nums.length;
		int count = 1;
		for (int i = 1; i < len;) {
			if (nums[i] == nums[i - 1])
				count++;
			else
				count = 1;
			if (count > 2) {
				for (int j = i; j < len - 1; j++) {
					nums[j] = nums[j + 1];
				}
				len--;
			}

			else
				i++;
		}

		return len;
	}
}
