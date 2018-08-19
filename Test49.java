import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test49 {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> rs = new ArrayList();

		Map<String,List<String>> mapping = new HashMap<>();
		for(String s : strs) {
			String temp = order(s);
			mapping.computeIfAbsent(temp, k->new LinkedList<>()).add(s);
		}
		rs.addAll(mapping.values());
		
		return rs;
	}
	
	private String order(String s) {
		char[] cc = s.toCharArray();
		Arrays.sort(cc);
		System.out.println(new String(cc));
		return new String(cc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
