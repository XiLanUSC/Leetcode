
public class Test4 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int imin = 0, imax = nums1.length, jmin = 0, jmax = nums2.length, middle = (imax + jmax) / 2;
		//System.out.println(imax+"   "+jmax);
		double maxleft = 0.0,minright = 0.0;
		if(imax>jmax) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
			imax = nums1.length;
			jmax = nums2.length;
		}
		while (imin <= imax) {
			int i = (imin + imax) / 2;
			int j = middle - i;
			System.out.println(i+"  "+j);
			if (i>imin&&i<imax&&nums1[i-1] > nums2[j]) {
				imax = imax - 1;
			}else if (i>imin&&i<imax&&nums2[j-1] > nums1[i]) {
				imin = imin + 1;
			}else {
				System.out.println(i+" "+j );
				if(i == 0) {
					maxleft = nums2[j-1];
					System.out.println("1");
				}else if(j == 0) {
					maxleft = nums1[i-1];
					System.out.println("2");
				}else {
					maxleft = Math.max(nums1[i-1], nums2[j-1]);
					System.out.println("3");
				}
				System.out.println(maxleft);
				if((nums1.length+nums2.length)%2 == 1)return maxleft;
				if(i == nums1.length) {
					minright = nums2[j];
				}else if(j == nums2.length) {
					minright = nums1[i];
				}else {
					minright = Math.min(nums1[i], nums2[j]);
				}
				return (minright+maxleft)/2.0;
			}
			//(nums1[i-1] <= nums2[j] && nums2[j-1] < nums1[i]) 
		}

		return 0.0;
	}
	public static void main(String args[]) {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
