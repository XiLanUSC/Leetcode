
public class Test2_2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int add = 0;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode rs = new ListNode(l1.val + l2.val);
		if (rs.val >= 10) {
			rs.val -= 10;
			add = 1;
		} else {
			add = 0;
		}
		l1 = l1.next;
		l2 = l2.next;
		ListNode temp = rs;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				temp.next = new ListNode(l2.val + add);
				temp = temp.next;
				if (temp.val >= 10) {
					temp.val -= 10;
					add = 1;
				} else {
					add = 0;
				}
				l2 = l2.next;
				continue;
			}
			if (l2 == null) {
				temp.next = new ListNode(l1.val + add);
				temp = temp.next;
				if (temp.val >= 10) {
					temp.val -= 10;
					add = 1;
				} else {
					add = 0;
				}

				l1 = l1.next;
				continue;
			}
			temp.next = new ListNode(l1.val + l2.val + add);
			temp = temp.next;
			if (temp.val >= 10) {
				temp.val -= 10;
				add = 1;
			} else {
				add = 0;
			}
			l1 = l1.next;
			l2 = l2.next;

		}
		if(add ==1) {
			temp.next = new ListNode(1);
		}
		return rs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
