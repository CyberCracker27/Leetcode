// Last updated: 9/12/2026, 7:24:59 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode fin=new ListNode();
        ListNode temp2=fin;
        int c=0;
        while(temp!=null){
            if(temp.val!=0){
                c+=temp.val;
            }else{
                ListNode temp1=new ListNode(c);
                temp2.next=temp1;
                temp2=temp2.next;
                c=0;
            }
            temp=temp.next;
        }
        return fin.next;
    }
}