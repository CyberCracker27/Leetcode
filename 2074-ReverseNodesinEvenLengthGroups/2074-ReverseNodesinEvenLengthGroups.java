// Last updated: 6/29/2026, 6:56:03 AM
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
12    public ListNode mergeNodes(ListNode head) {
13        ListNode temp=head.next;
14        ListNode fin=new ListNode();
15        ListNode temp2=fin;
16        int c=0;
17        while(temp!=null){
18            if(temp.val!=0){
19                c+=temp.val;
20            }else{
21                ListNode temp1=new ListNode(c);
22                temp2.next=temp1;
23                temp2=temp2.next;
24                c=0;
25            }
26            temp=temp.next;
27        }
28        return fin.next;
29    }
30}