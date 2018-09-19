import java.util.HashMap;

public class Test325 {
	public int maxSubArrayLen(int[] nums, int k) {
		if (nums.length == 0)
			return 0;
		int max = 0, sum = 0;

		HashMap<Integer, Integer> map = new HashMap();
		map.put(0, 0);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				System.out.println((sum - k) + " " + i + " " + map.get(sum - k));
				max = Math.max(max, i - map.get(sum - k) + 1);
			}
			if (!map.containsKey(sum))
				map.put(sum, i + 1);
		}

		return max;
	}
}
