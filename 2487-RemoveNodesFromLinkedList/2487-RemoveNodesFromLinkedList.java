// Last updated: 6/10/2026, 10:23:44 AM
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
12    public ListNode removeNodes(ListNode head) {
13        ListNode prev=null;
14        ListNode curr=head;
15        while(curr!=null){
16            ListNode temp=curr.next;
17            curr.next=prev;
18            prev=curr;
19            curr=temp;
20        }
21        ListNode temp=prev;
22        
23        int a=temp.val;
24        temp=temp.next;
25        ListNode temp1=new ListNode(a);
26        ListNode temp2=temp1;
27        while(temp!=null){
28            if(temp.val>=a){
29                a=temp.val;
30                ListNode t=new ListNode(a);
31                temp2.next=t;
32                temp2=temp2.next;
33            }
34            temp=temp.next;
35        }
36
37        prev=null;
38        curr=temp1;
39        while(curr!=null){
40            ListNode temp3=curr.next;
41            curr.next=prev;
42            prev=curr;
43            curr=temp3;
44        }
45
46        return prev;
47    }
48}