// Last updated: 7/13/2026, 8:55:35 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> li=new ArrayList<>();
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            li.add(temp.val);
            temp=temp.next;
            c++;
        }
        for(int start=0;start+k<=c;start+=k){
            int left=start,right=start+k-1;
            while(left<right){
                int a=li.get(left);
                li.set(left,li.get(right));
                li.set(right,a);
                left++;
                right--;
            }
        }
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=li.get(i++);
            temp=temp.next;
        }
        return head;
    }
}