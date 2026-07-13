// Last updated: 7/13/2026, 8:55:51 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        List<Integer> li=new ArrayList<>();
        int i=0;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
            i++;
        }
        li.remove(i-n);
        ListNode fin=new ListNode();
        temp=fin;
        for(int x:li){
            ListNode t=new ListNode(x);
            temp.next=t;
            temp=temp.next;
        }
        return fin.next;
    }
}