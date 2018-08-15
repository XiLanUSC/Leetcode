import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> rs = new ArrayList();
		List<Integer> temp = new ArrayList();
		Arrays.sort(candidates);
		getResult(rs,temp,candidates,target,0);
		
		
		return rs;
	}

	private boolean getResult(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
		
		if(remain<0)return false;
		else if(remain == 0) {
			list.add(new ArrayList<>(tempList));
			return true;
		}else {
			for(int i = start;i<nums.length;i++) {
				boolean flag;
				tempList.add(nums[i]);
				flag = getResult(list,tempList,nums,remain-nums[i],i);
				tempList.remove(tempList.size()-1);
				
				if(!flag)
					break;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
