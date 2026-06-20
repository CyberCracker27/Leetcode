// Last updated: 6/20/2026, 7:39:54 AM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        List<Integer> li=new ArrayList<>();
14        for(ListNode b:lists){
15            while(b!=null){
16                li.add(b.val);
17                b=b.next;
18            }
19        }
20        Collections.sort(li);
21        ListNode f=new ListNode(0);
22        ListNode temp=f;
23        for(int x:li){
24            ListNode newNode=new ListNode(x);
25            temp.next=newNode;
26            temp=temp.next;
27        }
28        return f.next;
29    }
30}