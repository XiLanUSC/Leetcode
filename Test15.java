import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList();;
		int len = nums.length;
		if (len <= 2)
			return result;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			if (i != 0 && nums[i] == nums[i - 1])
				continue;
			int j = i + 1, k = len - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> temp = new ArrayList();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					result.add(temp);
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1])
						j++;
					while (j < k && nums[k] == nums[k + 1])
						k--;
				} else if (nums[i] + nums[j] + nums[k] < 0)
					j++;
				else
					k--;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(a));
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
