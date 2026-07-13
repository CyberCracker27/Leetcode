// Last updated: 7/13/2026, 8:51:54 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> li=new ArrayList<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
            c++;
        }
        int a=li.get(k-1);
        li.set(k-1,li.get(c-k));
        li.set(c-k,a);
        temp=head;
        for(int x:li){
            temp.val=x;
            temp=temp.next;
        }
        return head;
    }
}