import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test491_2 {
	public List<List<Integer>> findSubsequences(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		
		findSub(set, nums, new ArrayList(), 0);
		return new ArrayList(set);
	}

	private void findSub(Set<List<Integer>> set, int[] nums, List<Integer> temp, int index) {
		if (temp.size() >= 2) {
			set.add(new ArrayList(temp));
			
		}
		
		for (int i = index; i < nums.length; i++) {
			if (temp.size() == 0 || temp.get(temp.size() - 1) <= nums[i]) {
				temp.add(nums[i]);
				findSub(set, nums, temp, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
