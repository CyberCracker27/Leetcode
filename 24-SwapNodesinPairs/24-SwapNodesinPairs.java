// Last updated: 6/9/2026, 2:54:39 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        ListNode temp=head;
14        while(temp!=null && temp.next!=null){
15            int c=temp.val;
16            temp.val=temp.next.val;
17            temp.next.val=c;
18            temp=temp.next.next;
19        }
20        return head;
21    }
22}