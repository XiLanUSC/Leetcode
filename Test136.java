
public class Test136 {
	public int singleNumber(int[] nums) {
        int result = 0;
        //System.out.println(5^3);
        for(int i = 0;i<nums.length;i++){
            result^=nums[i];
        }
        String s = " ";
        
        return result;
    }
}
