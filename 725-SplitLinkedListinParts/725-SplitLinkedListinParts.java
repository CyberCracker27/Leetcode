// Last updated: 7/4/2026, 5:31:25 PM
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
12    public ListNode[] splitListToParts(ListNode head, int k) {
13        ListNode[] arr=new ListNode[k];
14        ListNode temp=head;
15        int len=0;
16        while(temp!=null){
17            len++;
18            temp=temp.next;
19        }
20        int n=len/k,r=len%k;
21        for(int i=0;i<k;i++){
22            temp=head;
23            if(head==null){
24                arr[i]=head;
25                continue;
26            }
27            int j=1;
28            int t=n;
29            if(r!=0){
30                t++;
31                r--;
32            }
33            while(j<t && temp.next!=null){
34                temp=temp.next;
35                j++;
36            }
37            ListNode tmp=temp.next;
38            temp.next=null;
39            arr[i]=head;
40            head=tmp;
41        }
42        return arr;
43    }
44}