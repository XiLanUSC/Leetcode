
public class Test215 {
	public int findKthLargest(int[] nums, int k) {
		k = nums.length - k;
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			final int j = partition(nums, lo, hi);
			if (j < k) {
				lo = j + 1;
			} else if (j > k) {
				hi = j - 1;
			} else {
				break;
			}
		}
		return nums[k];
	}

	private int partition(int[] nums, int i, int j) {
		int low = i;
		int high = j;
		while (low < high) {
			while (low < j && nums[low] <= nums[i])
				low++;
			while (high > i && nums[high] >= nums[i])
				high--;
			swap(nums, low, high);
		}
		swap(nums, i, high);
		return high;
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
