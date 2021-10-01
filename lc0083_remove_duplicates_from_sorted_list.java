//LeetCode 206. Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		while(cur!=null && cur.next!null){
			if(cur.val == cur.next.val){
				cur.next = cur.next.next;
			}else{
				cur = cur.next;
			}
		}
		return head;       
    }
}
//.next理解成箭头, .val获取值，=是赋值(referencing)
//TC:O(n)
//SC:O(n)?
