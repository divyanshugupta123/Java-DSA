package LinkedList;

import LinkedList.LeetCode_21_MergeTwoSortedLists.ListNode;

public class sort_list_148 {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	class Solution {
	    public ListNode sortList(ListNode head) {
	    	if(head==null || head.next==null) {
	    		return head;
	    	}
	        ListNode mid = middleNode(head);
	        ListNode midnext = mid.next;
	        mid.next = null;
	        ListNode a =sortList(head);
	        ListNode b =sortList(midnext);
	        
	        return mergeTwoLists(a,b);
	        
	    }
	    public ListNode middleNode(ListNode head) {
	        // int a,b;
	        ListNode slow=head;
	        ListNode fast = head;
	        while(fast.next!=null && fast.next.next != null){
	                slow =slow.next;
	                fast= fast.next.next;

	        }
	        return slow;
	    }
	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode a=list1;
	        ListNode b=list2;
	        ListNode Dummy=new ListNode();
	        ListNode temp=Dummy;
	        while(a!=null && b!=null) {
	        	if(a.val <b.val) {
	        		Dummy.next=a;
	        		Dummy=Dummy.next;
	        		a=a.next;
	        	}
	        	else {
	        		Dummy.next=b;
	        		Dummy=Dummy.next;
	        		b=b.next;
	        	}
	        }
	        	if(a!=null){
	        		Dummy.next=a;
	        	}
	        	if(b!=null){
	        		Dummy.next=b;
	        	}
	        	return temp.next;
	    }
}
}
