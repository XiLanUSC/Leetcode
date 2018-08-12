
public class Test26 {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		boolean same = false,change = false;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (i != 0 &&nums[i-1]==nums[i]) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				i--;
				len--;
			} else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}
}
