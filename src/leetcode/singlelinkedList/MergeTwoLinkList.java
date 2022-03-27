package leetcode.singlelinkedList;

public class MergeTwoLinkList {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode();
	    ListNode newList = head;
		while(list1 != null && list2 != null) {
			if(list1.val < list2.val) {
				newList.next = list1;
				list1 = list1.next;
			} else {
				newList.next = list2;
				list2 = list2.next;
			}
			newList = newList.next;
		}
		
		if (list1 != null) {
			newList.next = list1;
		}
		if (list2 != null) {
			newList.next = list2;
		}
        return head.next;
    }

	public static void main(String[] args) {
		MergeTwoLinkList mc = new MergeTwoLinkList();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(4);
		n4.next = n5;
		n5.next = n6;
		
		ListNode nss = mc.mergeTwoLists(n1, n4);
		print(nss);
		//System.exit(0);
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