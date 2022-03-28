package leetcode.singlelinkedList;

public class SwapKthElementFromBegAndEnd {
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		ListNode n8 = new ListNode(1);
		ListNode n9 = new ListNode(10);
		ListNode n0 = new ListNode(411);
		n8.next = n9;
		n9.next = n0;
		ListNode nss = swap(n1, 2);
		print(nss);
	}
	
	private static ListNode swap(ListNode head, int k) {
		
		ListNode fast = head;
		ListNode slow = head;
		ListNode first = head;
		
		for(int i = 0; i < k -1 ; i++) {
			fast = fast.next;
		}
		
		first = fast;
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		Integer temp = first.val;
		first.val = slow.val;
		slow.val = temp;
		return head;
	}

	static void print(ListNode n) {
		if(n == null) {
			return;
		}
		System.out.println(n.val);
		n = n.next;
		print(n);
	}

}
