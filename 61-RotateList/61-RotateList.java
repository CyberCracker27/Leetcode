// Last updated: 6/23/2026, 7:16:17 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        ListNode prev=null;
14        ListNode temp=head;
15        int j=0;
16        
17        if(head==null || head.next==null) return head;
18        if(k==0) return head;
19        while(temp!=null){
20            ListNode t=temp.next;
21            temp.next=prev;
22            prev=temp;
23            temp=t;
24            j++;
25        }
26        k=k%j;
27        if(k==0) {
28            temp = prev;
29            ListNode originalPrev = null;
30            while(temp != null) {
31                ListNode t = temp.next;
32                temp.next = originalPrev;
33                originalPrev = temp;
34                temp = t;
35            }
36            return originalPrev;
37        }
38        ListNode prev1=null;
39        temp=prev;
40        ListNode first=temp;
41        int i=0;
42        
43        
44        while(i<k && temp!=null){
45            ListNode t=temp.next;
46            temp.next=prev1;
47            prev1=temp;
48            temp=t;
49            i++;
50        }
51        ListNode prev2=null;
52        ListNode second=temp;
53        while(temp!=null){
54            ListNode t=temp.next;
55            temp.next=prev2;
56            prev2=temp;
57            temp=t;
58        }
59        first.next=prev2;
60        second.next=null;
61        return prev1;
62    }
63}