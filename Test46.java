import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test46 {
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> rs = new ArrayList();
		List<Integer> temp = new ArrayList();
		List listnums = new ArrayList();
		for (int i = 0; i < nums.length; i++)
			listnums.add(nums[i]);
		get(rs, temp, nums);

		return rs;
	}

	private static void get(List<List<Integer>> rs, List<Integer> temp, int[] nums) {
		List<Integer> listnums = new ArrayList();
		for (int i = 0; i < nums.length; i++)
			listnums.add(nums[i]);
		for (int i = 0; i < listnums.size(); i++) {
			temp.add(listnums.get(i));
			int remo =listnums.get(i);
			listnums.remove(i);
			if (listnums.isEmpty()) {
				rs.add(temp);
				// return true;
			} else {
				get(rs, temp, nums);
			}
			temp.remove(temp.size()-1);
			listnums.add(i, remo);
//			temp = new ArrayList();
//			for (int j = 0; j < nums.length; j++)
//				listnums.add(nums[j]);
		}

		// return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		System.out.println(permute(nums));
	}

}
