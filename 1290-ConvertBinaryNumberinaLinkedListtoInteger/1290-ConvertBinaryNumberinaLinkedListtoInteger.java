// Last updated: 6/9/2026, 11:30:22 AM
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
12    public int getDecimalValue(ListNode head) {
13        String s="";
14        ListNode temp=head;
15        while(temp!=null){
16            s=s+temp.val;
17            temp=temp.next;
18        }
19        return Integer.parseInt(s,2);
20    }
21}