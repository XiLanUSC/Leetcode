
public class Test6 {
	public static String convert(String s, int numRows) {
		if(numRows == 1)return s;
		String result = "";
		int[] rows = new int[s.length()];
		int count = 0, way = 1;
		for (int i = 0; i < s.length(); i++) {
			rows[i] = count;
			count += way;
			if (count == numRows - 1)
				way = -1;
			if (count == 0)
				way = 1;
		}
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < rows.length; j++) {
				if (rows[j] == i)
					result += s.charAt(j);
			}
		}

		return result;
	}

	// private getRow(int row,)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		System.out.println(convert(s,4));
	}

}
