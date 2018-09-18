import java.util.List;
import java.util.ArrayList;
//Time Limit Exceeded
public class Test300 {
	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		List<List<Integer>> dp = new ArrayList();
		int len = nums.length;
		List<Integer> first = new ArrayList();
		first.add(nums[0]);
		dp.add(first);
		int maxnum = 1;
		for (int i = 1; i < len; i++) {
			int count = 0;
			List<Integer> temp4this = new ArrayList();
			for (List<Integer> temp : dp) {
				if (nums[i] > temp.get(temp.size() - 1) && temp.size() + 1 > count) {
					temp4this = new ArrayList();
					temp4this.addAll(temp);
					// temp4this = temp;
					temp4this.add(nums[i]);
					count = temp.size() + 1;
				}
			}
			if (temp4this.size() == 0) {
				temp4this.add(nums[i]);
				dp.add(temp4this);
			} else {
				dp.add(temp4this);
			}
			if (temp4this.size() > maxnum) {
				maxnum = temp4this.size();
			}
			// System.out.println(i);
			// for(int temp:temp4this){
			// System.out.print(temp+" ");
			// }
			// System.out.println();
		}
//		int i = 0;
//		for (List<Integer> temp : dp) {
//			System.out.println(i);
//			for (int temp1 : temp) {
//				System.out.print(temp1 + " ");
//			}
//			System.out.println();
//			i++;
//		}

		return maxnum;
	}
}
