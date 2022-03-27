package leetcode;

public class MergeTwoLinkList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {
			
		}
		ListNode(int val) { 
			this.val = val; 
		}
		ListNode(int val, ListNode next) { 
			this.val = val; 
			this.next = next; 
		}
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		int min = 0;
		if(list1 != null && list2 != null) {
			if(list1.val < list2.val) {
				min = list1.val;
			} else {
				min = list2.val;
			}
		}
		
		
		ListNode newList = new ListNode(min);
        return newList;
    }

	public static void main(String[] args) {
		MergeTwoLinkList mc = new MergeTwoLinkList();
		mc.mergeTwoLists(null, null);
		
	}

}
