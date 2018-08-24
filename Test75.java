
public class Test75 {
	public static void sortColors(int[] nums) {
		int t1 = 0, t2 = nums.length - 1;
		int n = nums.length;
		for (int i = 0; i <= t2; ) {
			if (nums[i] == 0){
				int temp = nums[t1];
				nums[t1] = nums[i];
				nums[i] = temp;
				i++;
				t1++;
			}
			else if (nums[i] == 1) {
				i++;
			} else if (nums[i] == 2) {
				int temp = nums[t2];
				nums[t2] = nums[i];
				nums[i] = temp;
				t2--;
				
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {2,0,1};
		sortColors(nums);
	}
}
