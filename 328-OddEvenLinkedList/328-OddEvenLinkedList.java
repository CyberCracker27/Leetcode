// Last updated: 6/26/2026, 9:04:01 AM
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
12    public ListNode sortList(ListNode head) {
13        List<Integer> li=new ArrayList<>();
14        ListNode temp=head;
15        while(temp!=null){
16            li.add(temp.val);
17            temp=temp.next;
18        }
19        Collections.sort(li);
20        temp=head;
21        for(int x:li){
22            temp.val=x;
23            temp=temp.next;
24        }
25        return head;
26    }
27}