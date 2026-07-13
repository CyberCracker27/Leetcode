// Last updated: 7/13/2026, 8:55:37 PM
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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            int c=temp.val;
            temp.val=temp.next.val;
            temp.next.val=c;
            temp=temp.next.next;
        }
        return head;
    }
}