
public class Test2 {
	public static void main(String args[]) {
		ListNode test = new ListNode(1);
		ListNode temp = test;
		for(int i = 0;i<9;i++) {
			temp.next = new ListNode(9);
			temp = temp.next;
		}
		ListNode test2 = new ListNode(9);
		ListNode result = addTwoNumbers(test,test2);
		temp = result;
		while(temp !=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
		//System.out.println(linkToInt(test));
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long i1 = linkToInt(l1), i2 = linkToInt(l2);
		System.out.println(i1+"    "+i2);
		long result = i1 + i2;
		ListNode ans = intToLink(result);

		return ans;

	}

	private static long linkToInt(ListNode l) {
		long result = 0, times = 1;
		while (l != null) {
			result += l.val * times;
			times *= 10;
			l = l.next;
		}
		return result;
	}

	private static ListNode intToLink(long num) {
		int count = 0;
		long n = num;
		while (n > 0) {
			n = n / 10;
			count++;
		}

		ListNode result = null;
		result = new ListNode((int)(num % 10));
		ListNode temp = result;
		long times = 10;
		while (count > 1) {
			temp.next = new ListNode((int)((num / times) % 10));
			times *= 10;
			temp = temp.next;
			count--;
		}

		return result;
	}
	
}
