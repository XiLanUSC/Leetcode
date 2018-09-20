import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Test347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> rs = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}
		for (int i = 0; i < k; i++) {
			int maxIndex = nums[0];
			for (int j = 0; j < nums.length; j++) {
				if (map.containsKey(nums[j])) {
					maxIndex = nums[j];
					break;
				}
			}

			Iterator iter = map.entrySet().iterator();
			while (iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();
				int key = (int) entry.getKey();
				int val = (int) entry.getValue();
				if (val > map.get(maxIndex)) {
					maxIndex = key;
				}
			}
			rs.add(maxIndex);
			map.remove(maxIndex);
		}
		return rs;
	}
}
