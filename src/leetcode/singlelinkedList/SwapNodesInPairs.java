package leetcode.singlelinkedList;

public class SwapNodesInPairs {
	
	public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head.next;
        head.next = swapPairs(head.next.next);
        p1.next = head;
        return p1;
       
    }

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(6);
		ListNode n7 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		ListNode nss = swapPairs(n1);
		print(nss);
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
