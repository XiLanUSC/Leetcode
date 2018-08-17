
public class Test43 {
	public static String multiply(String num1, String num2) {
		if(num1.equals("0")||num2.equals("0"))return "0";
		String rs = "";
		String[] temp = new String[num1.length()];
		for (int i = num1.length() - 1; i >= 0; i--)
			temp[i] = "";

		for (int i = num1.length() - 1; i >= 0; i--) {
			int product = 0, add = 0;
			for (int j = num2.length() - 1; j >= 0; j--) {
				product = Integer.parseInt(num1.charAt(i) + "") * Integer.parseInt(num2.charAt(j) + "");
				product += add;
				// System.out.println("i:"+i+" num1:"+num1.charAt(i)+" "+product);
				temp[i] = (product % 10) + temp[i];
				add = product / 10;
			}
			if (add != 0)
				temp[i] = add + temp[i];
			String zeros = "";
			for (int j = 0; j < num1.length() - 1 - i; j++) {
				zeros = "0" + zeros;
			}
			temp[i] = temp[i] + zeros;
		}

		int max = 0;

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			if (temp[i].length() > max)
				max = temp[i].length();
		}

		int product = 0, add = 0;
		for (int i = 0; i < max; i++) {
			product = 0;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j].length() > i)
					product += Integer.parseInt("" + temp[j].charAt(temp[j].length() - 1 - i));
			}
			product += add;
			rs = (product % 10) + rs;
			add = product / 10;
		}
		if(add !=0)
			rs = add+rs;

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply("2", "3"));
	}

}
