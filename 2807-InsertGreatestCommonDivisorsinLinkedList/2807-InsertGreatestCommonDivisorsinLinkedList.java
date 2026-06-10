// Last updated: 6/10/2026, 9:51:41 AM
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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13        ListNode temp=head;
14        ListNode prev=head;
15        int a=temp.val;
16        temp=temp.next;
17        while(temp!=null){
18            int b=temp.val;
19            int c=gcd(a,b);
20            a=temp.val;
21            ListNode new_node=new ListNode(c);
22            prev.next=new_node;
23            new_node.next=temp;
24            prev=temp;
25            temp=temp.next;
26        }
27        return head;
28    }
29    public static int gcd(int a,int b){
30        while(b!=0){
31            int t=b;
32            b=a%b;
33            a=t;
34        }
35        return a;
36    }
37}