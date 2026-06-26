// Last updated: 6/26/2026, 9:00:58 AM
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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode odd=head,even=head.next,evenHead=even;
15        while(even!=null && even.next!=null){
16            odd.next=even.next;
17            odd=odd.next;
18            even.next=even.next.next;
19            even=even.next;
20        }
21        odd.next=evenHead;
22        return head;
23    }
24}