import java.util.Arrays;

public class Test31 {
	public static void nextPermutation(int[] nums) {
		int pos = nums.length - 1;
		if (nums.length == 1 || nums.length == 0)
			return;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		while (pos > 0 && nums[pos - 1] >= nums[pos]) {
			pos--;
		}
		System.out.println(pos);
		if (pos == 0) {
			Arrays.sort(nums);
		} else {
			if (pos == nums.length - 1) {
				int temp = nums[pos - 1];
				nums[pos - 1] = nums[pos];
				nums[pos] = temp;
			} else {
				int minpos = pos;
				for (int i = pos; i < nums.length; i++)
					if (nums[i] > nums[pos - 1] && nums[i] < nums[minpos])
						minpos = i;

				int temp = nums[pos - 1];
				nums[pos - 1] = nums[minpos];
				nums[minpos] = temp;
				Arrays.sort(nums, pos, nums.length);
			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,1};
		nextPermutation(nums);
	}

}
