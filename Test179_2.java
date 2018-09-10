import java.util.Arrays;
import java.util.Comparator;

public class Test179_2 {
	public String largestNumber(int[] nums) {
	    String[] input = new String[nums.length];
	    for (int i = 0; i < nums.length; i++) {
	        input[i] = String.valueOf(nums[i]);
	    }
	    Arrays.sort(input, new MyComparator());
	    if (input[0].equals("0")) {
	        return "0";
	    }
	    StringBuilder sb = new StringBuilder();
	    for(String s : input) {
	      sb.append(s);
	    }
	    return sb.toString();
	  }
	  public static class MyComparator implements Comparator<String> {
	    @Override
	    public int compare(String s1, String s2) {
	      return helper(s1, 0, s1.length() - 1, s2, 0, s2.length() - 1);
	      //String order1 = s1 + s2;
	      //String order2 = s2 + s1;
	      //return order2.compareTo(order1);
	    }
	    private  int helper(String s1, int oneLeft, int oneRight, String s2, int twoLeft, int twoRight) {
	      int length = Math.min(oneRight - oneLeft + 1, twoRight - twoLeft + 1);
	      if (length == 0) {
	        return 0;
	      }
	      int p1 = oneLeft;
	      int p2 = twoLeft;
	      for(int i = 0; i < length; i++) {
	        if(s1.charAt(p1) < s2.charAt(p2)) {
	          return 1;
	        } else if(s1.charAt(p1) > s2.charAt(p2)) {
	          return -1;
	        }
	        p1++;
	        p2++;
	      }
	      if (p1 > oneRight) {
	        return helper(s1, oneLeft, oneRight, s2, p2, twoRight); 
	      } else {
	        return helper(s1, p1, oneRight, s2, twoLeft, twoRight);
	      }
	    }
	  }
}
