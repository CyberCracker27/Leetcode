// Last updated: 7/13/2026, 8:55:40 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> li=new ArrayList<>();
        for(ListNode b:lists){
            while(b!=null){
                li.add(b.val);
                b=b.next;
            }
        }
        Collections.sort(li);
        ListNode f=new ListNode(0);
        ListNode temp=f;
        for(int x:li){
            ListNode newNode=new ListNode(x);
            temp.next=newNode;
            temp=temp.next;
        }
        return f.next;
    }
}