// Last updated: 6/23/2026, 7:28:32 AM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        HashMap<Integer,Integer> map=new HashMap<>();
14        List<Integer> f=new ArrayList<>();
15        ListNode temp=head;
16        while(temp!=null){
17            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
18            temp=temp.next;
19        }
20        ListNode fin=new ListNode();
21        ListNode temp1=fin;
22        for(int x:map.keySet()){
23            if(map.get(x)==1){
24                f.add(x);
25            }
26        }
27        Collections.sort(f);
28        for(int y:f){
29            ListNode a=new ListNode(y);
30            temp1.next=a;
31            temp1=temp1.next;
32            
33        }
34        return fin.next;
35    }
36}