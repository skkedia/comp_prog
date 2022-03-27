package leetcode.singlelinkedList;

public class PalindromeList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(0);
		ListNode n6 = new ListNode(1);
		//ListNode n7 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		//n6.next = n7;
		boolean pal = isListPaindrome(n1);
		System.out.println(pal);
	}

	private static boolean isListPaindrome(ListNode head) {
		ListNode ln = head;
		String pp = "";
		while(ln != null) {
			pp += ln.val + "";
			ln = ln.next;
		}
		ln = head;
		Integer count = pp.length() - 1;
		Integer c = count;
		int i = 0;
		while(ln != null && i <= c/2) {
			if(!(ln.val == Integer.parseInt(String.valueOf(pp.charAt(count))))) {
				return false;
			}
			count -= 1;
			i += 1;
			ln = ln.next;
		}
		return true;
	}
}
