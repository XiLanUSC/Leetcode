import java.util.ArrayList;
import java.util.List;

public class Test47 {
	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
		get(rs, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return rs;
	}

	private static void get(List<List<Integer>> rs, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			if (!rs.contains(temp))
				rs.add(new ArrayList(temp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!used[i]) {
				used[i] = true;
				temp.add(nums[i]);
				get(rs, temp, nums, used);
				temp.remove(temp.size() - 1);
				used[i] = false;
			}
		}
	}
}
