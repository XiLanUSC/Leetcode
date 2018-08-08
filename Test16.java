import java.util.Arrays;

public class Test16 {
	public static int threeSumClosest(int[] nums, int target) {
		int result = 0;
		int lens = nums.length;
		if (nums.length == 0)
			return 0;
		if (nums.length <= 3) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			return sum;
		}
		Arrays.sort(nums);
		for (int i = 0; i < lens; i++) {
			int j = i + 1, k = lens - 1, temp = Integer.MAX_VALUE,sum = 0;
			//System.out.println(j+" "+k);
			if(j == k)break;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == target) {
					return target;
				} else if (nums[i] + nums[j] + nums[k] < target) {
					if (Math.abs(target - (nums[i] + nums[j] + nums[k])) < temp) {
						temp = Math.abs(target - (nums[i] + nums[j] + nums[k]));
						sum = nums[i] + nums[j] + nums[k];
					}
					j++;
					
				} else {
					if (Math.abs(target - (nums[i] + nums[j] + nums[k])) < temp) {
						temp = Math.abs(target - (nums[i] + nums[j] + nums[k]));
						sum = nums[i] + nums[j] + nums[k];
					}
					k--;	
				}
			}
			if(i == 0)result = sum;
			else {
				if(Math.abs(sum-target)<Math.abs(result-target)) {
					result = sum;
					//System.out.println(sum+"  "+i+","+j+","+k+" "+nums[i] +" "+ nums[j]+" " + nums[k]);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,1,1};
		System.out.println(threeSumClosest(a,1));

	}

}
