// Last updated: 7/13/2026, 8:54:36 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode temp1=head;
        List<Integer> li=new ArrayList<>();
        while(temp1!=null){
            if(temp1.val<x){
                li.add(temp1.val);
            }
            temp1=temp1.next;
        }
        //Collections.sort(li);
        ListNode temp=head;
        while(temp!=null){
            if(temp.val>=x){
                li.add(temp.val);
            }
            temp=temp.next;
        }
        ListNode fin=new ListNode();
        temp=fin;
        for(int y:li){
            ListNode t=new ListNode(y);
            temp.next=t;
            temp=temp.next;
        }
        return fin.next;
    }
}