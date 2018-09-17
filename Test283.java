
public class Test283 {
	public void moveZeroes(int[] nums) {
		int len = nums.length;
		for(int i = 0;i<len;) {
			if(nums[i] == 0) {
				for(int j = i+1;j<len;j++) {
					nums[j-1] = nums[j];
				}
				nums[len-1] = 0;
				len--;
			}else {
				i++;
			}
		}
	}
}
