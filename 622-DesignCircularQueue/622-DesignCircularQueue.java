// Last updated: 6/27/2026, 10:28:25 AM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        List<Integer> li=new ArrayList<>();
14        ListNode temp=head;
15        int c=0;
16        while(temp!=null){
17            li.add(temp.val);
18            temp=temp.next;
19            c++;
20        }
21        int a=li.get(k-1);
22        li.set(k-1,li.get(c-k));
23        li.set(c-k,a);
24        temp=head;
25        for(int x:li){
26            temp.val=x;
27            temp=temp.next;
28        }
29        return head;
30    }
31}