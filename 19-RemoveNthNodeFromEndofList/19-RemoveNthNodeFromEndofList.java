// Last updated: 6/24/2026, 6:56:47 AM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode temp=head;
14        List<Integer> li=new ArrayList<>();
15        int i=0;
16        while(temp!=null){
17            li.add(temp.val);
18            temp=temp.next;
19            i++;
20        }
21        li.remove(i-n);
22        ListNode fin=new ListNode();
23        temp=fin;
24        for(int x:li){
25            ListNode t=new ListNode(x);
26            temp.next=t;
27            temp=temp.next;
28        }
29        return fin.next;
30    }
31}