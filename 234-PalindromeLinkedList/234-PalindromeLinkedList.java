// Last updated: 6/9/2026, 4:07:17 PM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode cp=new ListNode();
14        ListNode temp2=head;
15        ListNode temp3=cp;
16        while(temp2!=null){
17            temp3.next=new ListNode(temp2.val);
18            temp3=temp3.next;
19            temp2=temp2.next;
20        }
21        cp=cp.next;
22        ListNode rev=null;
23        ListNode temp=head;
24        while(temp!=null){
25            ListNode t=temp.next;
26            temp.next=rev;
27            rev=temp;
28            temp=t;
29        }
30        ListNode temp1=cp;
31        while(rev!=null && temp1!=null){
32            if(temp1.val!=rev.val){
33                return false;
34            }
35            rev=rev.next;
36            temp1=temp1.next;
37        }
38        return true;
39    }
40}