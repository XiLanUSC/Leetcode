
public class Test33 {
	public int search(int[] nums, int target) {
        if(nums.length == 0)return -1;
        int pos = 0;
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = left +(right-left)/2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > nums[right]) {
				if (nums[mid] > target && nums[left] <= target)
					right = mid - 1;
				else
					left = mid + 1;
			} else {
				if (nums[mid] < target && nums[right] >= target)
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		if (nums[left] != target)
			return -1;
		else
			return left;
    }
}
