// Last updated: 9/12/2026, 7:22:14 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode prev=head;
        int a=temp.val;
        temp=temp.next;
        while(temp!=null){
            int b=temp.val;
            int c=gcd(a,b);
            a=temp.val;
            ListNode new_node=new ListNode(c);
            prev.next=new_node;
            new_node.next=temp;
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}