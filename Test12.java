
public class Test12 {
	public static String intToRoman(int num) {
		String rs = "";
		int temp = 0;
		if (num >= 1000) {
			temp = num / 1000;
			num = num % 1000;
			for (int i = 0; i < temp; i++)
				rs += 'M';
		}
		if(num>=900) {
			temp = num / 900;
			num = num % 900;
			for (int i = 0; i < temp; i++)
				rs += "CM";
		}
		if(num>=500) {
			temp = num / 500;
			num = num % 500;
			for (int i = 0; i < temp; i++)
				rs += "D";
		}
		if(num>=400) {
			temp = num / 400;
			num = num % 400;
			for (int i = 0; i < temp; i++)
				rs += "CD";
		}
		if(num>=100) {
			temp = num / 100;
			num = num % 100;
			for (int i = 0; i < temp; i++)
				rs += "C";
		}
		if(num>=90) {
			temp = num / 90;
			num = num % 90;
			for (int i = 0; i < temp; i++)
				rs += "XC";
		}
		if(num>=50) {
			temp = num / 50;
			num = num % 50;
			for (int i = 0; i < temp; i++)
				rs += "L";
		}
		if(num>=40) {
			temp = num / 40;
			num = num % 40;
			for (int i = 0; i < temp; i++)
				rs += "XL";
		}
		if(num>=10) {
			temp = num / 10;
			num = num % 10;
			for (int i = 0; i < temp; i++)
				rs += "X";
		}
		if(num>=9) {
			temp = num / 9;
			num = num % 9;
			for (int i = 0; i < temp; i++)
				rs += "IX";
		}
		if(num>=5) {
			temp = num / 5;
			num = num % 5;
			for (int i = 0; i < temp; i++)
				rs += "V";
		}
		if(num>=4) {
			temp = num / 4;
			num = num % 4;
			for (int i = 0; i < temp; i++)
				rs += "IV";
		}
		if(num>=1) {
			temp = num / 1;
			num = num % 1;
			for (int i = 0; i < temp; i++)
				rs += "I";
		}

		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		System.out.println(intToRoman(num));
	}

}
