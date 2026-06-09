// Last updated: 6/9/2026, 10:07:46 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        List<Integer> li=new ArrayList<>();
14        ListNode temp=head;
15        int c=0;
16        while(temp!=null){
17            li.add(temp.val);
18            temp=temp.next;
19            c++;
20        }
21        for(int start=0;start+k<=c;start+=k){
22            int left=start,right=start+k-1;
23            while(left<right){
24                int a=li.get(left);
25                li.set(left,li.get(right));
26                li.set(right,a);
27                left++;
28                right--;
29            }
30        }
31        temp=head;
32        int i=0;
33        while(temp!=null){
34            temp.val=li.get(i++);
35            temp=temp.next;
36        }
37        return head;
38    }
39}