
public class Test27 {
	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == val) {
				for (int j = i; j < len - 1; j++) {
					nums[j] = nums[j + 1];
				}
				len--;
				i--;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
