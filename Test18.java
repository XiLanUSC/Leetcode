import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test18 {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> rs = new ArrayList();
		if (nums.length < 4)
			return rs;
		List<Integer> temp = new ArrayList();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int m = j + 1, n = nums.length - 1;
				while (m < n) {
					if (nums[i] + nums[j] + nums[m] + nums[n] == target) {
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[m]);
						temp.add(nums[n]);
						if (!rs.contains(temp))
							rs.add(temp);
						temp = new ArrayList();
						m++;
						n--;
					} else if (nums[i] + nums[j] + nums[m] + nums[n] < target) {
						m++;
					} else {
						n--;
					}

				}
				while (j < nums.length - 2 && nums[j] == nums[j + 1])
					++j;
			}
			while (i < nums.length - 3 && nums[i] == nums[i + 1])
				++i;
		}

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1, 0, -5, -2, -2, -4, 0, 1, -2 };
		System.out.println(fourSum(a, -9));
	}

}
