import java.util.HashMap;

public class Test166 {
	public String fractionToDecimal(int numerator, int denominator) {
		String rs = "";
		if (denominator == 0)
			return "";
		if (numerator == 0)
			return "0";

		HashMap<Integer, Integer> map = new HashMap<>();

		rs = numerator / denominator + "";
		int rest = numerator % denominator;
		if (rest != 0)
			rs = rs + ".";

		while (rest != 0) {

		}
		return rs;
	}
}
