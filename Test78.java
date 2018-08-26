import java.util.ArrayList;
import java.util.List;

public class Test78 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> rs = new ArrayList();
		List<Integer> temp = new ArrayList();
		get(rs,temp,nums,0);
		
		
		return rs;
	}
	private void get(List<List<Integer>> rs,List<Integer> temp, int[] nums,int start) {
		if(!rs.contains(new ArrayList(temp))) 
			rs.add(new ArrayList(temp));
		if(start>nums.length)return;
		
		
		for(int i = start;i<nums.length;i++) {
			temp.add(nums[i]);
			get(rs,temp,nums,i+1);
			temp.remove(temp.size()-1);
		}
		
		
	}
}
