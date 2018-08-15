
public class Test38 {
	public static String countAndSay(int n) {
		String rs = "1";
		for (int i = 1; i < n; i++) {
			String rs1 = "";
			for (int j = 0; j < rs.length(); j++) {
				char temp = rs.charAt(j);
				int count = 1;
				while (j < rs.length() - 1 && rs.charAt(j + 1) == temp) {
					j++;
					count++;
				}
				rs1 +=(count+""+temp);
			}
			rs = rs1;
		}
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(countAndSay(n));
	}

}
