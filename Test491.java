import java.util.ArrayList;
import java.util.List;

public class Test491 {
	public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> rs = new ArrayList();
        if(nums.length<=1)return rs;
        int pos = 1;
        while(pos<nums.length&&nums[pos]<nums[pos-1])
            pos++;
        if(pos == nums.length)return rs;
        
        for(int i = pos-1;i>=0;i--){
            if(nums[pos]>=nums[i]){
                List<Integer> temp = new ArrayList();
                temp.add(nums[i]);
                temp.add(nums[pos]);
                rs.add(new ArrayList(temp));
            }else
                break;
        }
        for(int i = pos+1;i<nums.length;i++){
            List<List<Integer>> rsTemp = new ArrayList();
            for(List<Integer> temp :rs){
                if(nums[i]>=temp.get(temp.size()-1)){
                    //rsTemp.add(temp);
                    List<Integer> copy = new ArrayList();
                    for(int num:temp)
                        copy.add(num);
                    rsTemp.add(copy);
                    temp.add(nums[i]);
                    if(!rs.contains(temp))rs.add(temp);
                }
            }
            for(List<Integer> temp :rsTemp){
                if(!rs.contains(temp))
                    rs.add(temp);
            }
            for(int j = 0;j<i;j++){
                if(nums[i]>=nums[j]){
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[j]);
                    temp.add(nums[i]);
                    if(!rs.contains(temp))
                        rs.add(new ArrayList(temp));
                }
            }
        }
        return rs;
    }
}
