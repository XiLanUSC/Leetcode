import java.util.ArrayList;
import java.util.List;

public class Test77 {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> rs = new ArrayList();
		List<Integer> temp = new ArrayList();
		get(rs,temp,0,n,k);
		return rs;
	}

	public void get(List<List<Integer>> rs, List<Integer> temp, int now, int n, int k) {
		if (temp.size() == k){
			rs.add(new ArrayList(temp));
			return;
		}
		if (now > n)
			return;
		get(rs, temp, now + 1, n, k);
		temp.add(now);
		get(rs, temp, now + 1, n, k);
		temp.remove(temp.size()-1);
		//now++;

	}
}
