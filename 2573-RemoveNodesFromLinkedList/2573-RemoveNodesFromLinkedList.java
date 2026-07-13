// Last updated: 7/13/2026, 8:47:54 PM
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
    public ListNode removeNodes(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode temp=prev;
        
        int a=temp.val;
        temp=temp.next;
        ListNode temp1=new ListNode(a);
        ListNode temp2=temp1;
        while(temp!=null){
            if(temp.val>=a){
                a=temp.val;
                ListNode t=new ListNode(a);
                temp2.next=t;
                temp2=temp2.next;
            }
            temp=temp.next;
        }

        prev=null;
        curr=temp1;
        while(curr!=null){
            ListNode temp3=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp3;
        }

        return prev;
    }
}