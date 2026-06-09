// Last updated: 6/9/2026, 2:25:36 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode list3=new ListNode();
14        List<Integer> li=new ArrayList<>();
15        while(list1!=null){
16            li.add(list1.val);
17            list1=list1.next;
18        }
19        while(list2!=null){
20            li.add(list2.val);
21            list2=list2.next;
22        }
23        int[] arr=new int[li.size()];
24        for(int i=0;i<li.size();i++){
25            arr[i]=li.get(i);
26        }
27        Arrays.sort(arr);
28        System.out.println(Arrays.toString(arr));
29        for(int i=0;i<arr.length;i++){
30            ListNode new_node=new ListNode(arr[i]);
31            System.out.print(arr[i]);
32            if(list3==null){
33                list3=new_node;
34            }else{
35                ListNode temp=list3;
36                while(temp.next!=null){
37                    temp=temp.next;
38                }
39                temp.next=new_node;
40            }
41
42        }
43        return list3.next;
44    }
45}