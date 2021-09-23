//LeetCode 206. Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        //corner case, actually this corner case is covered in the regular-case code
        //if(head == null) return null;
        ListNode temp = head;
        //result可以定义为null,因为code中第一次循环没有用到result.next
        //这点和LeetCode21.merge two sorted lists区别
        ListNode result = null;
        //ListNode result = new ListNode(); 不可以这样，因为这样初始的result的头部值为0；
        //while循环终点：每次循环temp不断变为tempNext(少一个node)，直至变为原List head的尾部null
        while(temp!=null){
            ListNode tempNext = temp.next;
            temp.next = result;
            result = temp;
            temp = tempNext;
        }
        return result;
    }
}

//TC: O(n)
//SC: O(1)
