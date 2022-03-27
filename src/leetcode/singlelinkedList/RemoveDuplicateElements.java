package leetcode.singlelinkedList;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode nss = removeDuplicateElements(n1);
		print(nss);
	}
	private static ListNode removeDuplicateElements(ListNode head) {
		if(head == null) {
			return null;
		}
        ListNode curr = head;
        ListNode next = head.next;
        while (next != null) {
        	if(next.val == curr.val) {
        		curr.next = next.next;
        	} else {
        		curr = curr.next;
        	}
        	next = next.next;
        }
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
