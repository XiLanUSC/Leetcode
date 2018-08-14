
public class Test34 {
	public static int[] searchRange(int[] nums, int target) {
		int[] rs = new int[2];
		if(nums.length == 0) {
			rs[0] = -1;
			rs[1] = -1;
			return rs;
		}else if(nums.length ==1) {
			if(nums[0] == target) {
				rs[0] = 0;
				rs[1] = 0;
				return rs;
			}else {
				rs[0] = -1;
				rs[1] = -1;
				return rs;
			}
		}
		int temp = nums.length / 2;
		int min = 0, max = nums.length;
		while (min < max-1 && nums[temp] != target) {
			if (nums[temp] < target) {
				min = temp;
				temp = (temp + max) / 2;

			} else if (nums[temp] > target) {
				max = temp;
				temp = (min + temp) / 2;
			} else {
				break;
			}
		}
		if(nums[temp]!=target) {
			rs[0] = -1;
			rs[1] = -1;
			return rs;
		}else {
			
			for(int i = temp;i>=0;i--) {
				if(nums[i] == target)rs[0] = i;
				else break;
			}
			for(int i = temp;i<nums.length;i++) {
				if(nums[i] == target)rs[1] = i;
				else break;
			}
		}
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] result = searchRange(nums,target);
		System.out.println(result[0]+" "+result[1]);
	}

}
