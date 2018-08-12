
public class Test21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode rs = new ListNode(0);
		ListNode result = rs;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				rs.next = new ListNode(l1.val);
				rs = rs.next;
				l1 = l1.next;
			} else {
				rs.next = new ListNode(l2.val);
				rs = rs.next;
				l2 = l2.next;
			}

		}
		if (l1 == null) {
			rs.next = l2;
		}
		if (l2 == null) {
			rs.next = l1;
		}

		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
