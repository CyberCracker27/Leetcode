// Last updated: 6/9/2026, 9:38:23 PM
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
12    public void reorderList(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        while(fast!=null && fast.next!=null){
16            slow=slow.next;
17            fast=fast.next.next;
18        }
19        ListNode curr=slow,prev=null;
20        while(curr!=null){
21            ListNode t=curr.next;
22            curr.next=prev;
23            prev=curr;
24            curr=t;
25        }
26        ListNode first=head;
27        ListNode second=prev;
28        while(first.next!=null && second.next!=null){
29            ListNode t1=first.next;
30            ListNode t2=second.next;
31            first.next=second;
32            second.next=t1;
33            first=t1;
34            second=t2;
35        }
36    }
37}