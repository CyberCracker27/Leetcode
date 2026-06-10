// Last updated: 6/10/2026, 10:42:09 AM
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
12    public int[] nextLargerNodes(ListNode head) {
13        List<Integer> li=new ArrayList<>();
14        ListNode temp=head;
15        while(temp!=null){
16            int a=temp.val;
17            int c=0;
18            ListNode temp1=temp.next;
19            while(temp1!=null){
20                if(a<temp1.val){
21                    c=temp1.val;
22                    break;
23                }
24                temp1=temp1.next;
25            }
26            li.add(c);
27            temp=temp.next;
28        }
29        int arr[]=new int[li.size()];
30        for(int i=0;i<li.size();i++){
31            arr[i]=li.get(i);
32        }
33        return arr;
34    }
35}