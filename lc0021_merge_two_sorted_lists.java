//LeetCode 21. Merge Two Sorted Lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode();
		ListNode tail = dummy;
		while(l1!=null && l2!=null){
			if(l1.val<l2.val){
                //.next一定要有，把新和成list的第一个『有效值』的node赋给tail的下一个node
				tail.next = l1;
				l1 = l1.next;
			}else{
				tail.next = l2;
				l2 = l2.next;
			}
            //更新tail成tail.next
			tail = tail.next;
		}
		if(l1!=null){
			tail.next = l1;
		}
		if(l2!=null){
			tail.next = l2;
		}
		return dummy.next;
    }
}

//TC: O(n), worst-case: O(m+n)
//SC: O(1)
