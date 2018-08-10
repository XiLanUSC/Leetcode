import java.util.ArrayList;
import java.util.List;

public class Test17 {
	public static List<String> letterCombinations(String digits) {
		
		List<String> list = new ArrayList();
		if(digits.equals("") )
			return list;
		String[][] words = { {}, {}, { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" }, { "j", "k", "l" },
				{ "m", "n", "o" }, { "p", "q", "r", "s" }, { "t", "u", "v" }, { "w", "x", "y", "z" } };
		int n = Integer.parseInt(digits.charAt(0) + "");
		for (int i = 0; i < words[n].length; i++) {
			list.add(words[n][i]);
		}
		for (int i = 1; i < digits.length(); i++) {
			List<String> temp = new ArrayList();
			;
			// String ss = digits.charAt(i)+"";
			int num = Integer.parseInt(digits.charAt(i) + "");

			for (String s : list) {
				for (int j = 0; j < words[num].length; j++) {
					temp.add(s + words[num][j]);
				}
			}

			list = temp;
		}

		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("23"));
	}

}
