// Last updated: 6/24/2026, 7:30:46 AM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode temp1=head;
14        List<Integer> li=new ArrayList<>();
15        while(temp1!=null){
16            if(temp1.val<x){
17                li.add(temp1.val);
18            }
19            temp1=temp1.next;
20        }
21        //Collections.sort(li);
22        ListNode temp=head;
23        while(temp!=null){
24            if(temp.val>=x){
25                li.add(temp.val);
26            }
27            temp=temp.next;
28        }
29        ListNode fin=new ListNode();
30        temp=fin;
31        for(int y:li){
32            ListNode t=new ListNode(y);
33            temp.next=t;
34            temp=temp.next;
35        }
36        return fin.next;
37    }
38}