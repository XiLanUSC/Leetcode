
public class Test35 {
	public static int searchInsert(int[] nums, int target) {
		if (nums.length == 0)
			return 0;

		int i = 0, back = 0;
		if (nums[i] >= target) {
			return i;
		} else if (nums[i] < target) {
			i++;
		}
		for (; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1 };
		int target = 0;
		System.out.println(searchInsert(nums, target));
	}

}
