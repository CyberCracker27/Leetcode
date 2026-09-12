// Last updated: 9/12/2026, 7:38:27 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            int a=temp.val;
            int c=0;
            ListNode temp1=temp.next;
            while(temp1!=null){
                if(a<temp1.val){
                    c=temp1.val;
                    break;
                }
                temp1=temp1.next;
            }
            li.add(c);
            temp=temp.next;
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}