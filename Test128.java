import java.util.HashMap;
import java.util.Random;

public class Test128 {
	public int longestConsecutive(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int rs = 0;
		for(int n: nums) {
			if(!map.containsKey(n)) {
				int left = (map.containsKey(n-1))?map.get(n-1):0;
				int right = (map.containsKey(n+1))?map.get(n+1):0;
				int sum = left+right+1;
				if(sum>rs)rs = sum;
				map.put(n, sum);
				map.put(n-left, sum);
				map.put(n+right, sum);
			}
		}
		return rs;
	}
}
