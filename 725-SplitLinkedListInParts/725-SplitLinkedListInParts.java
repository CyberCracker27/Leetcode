// Last updated: 7/13/2026, 8:51:18 PM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr=new ListNode[k];
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int n=len/k,r=len%k;
        for(int i=0;i<k;i++){
            temp=head;
            if(head==null){
                arr[i]=head;
                continue;
            }
            int j=1;
            int t=n;
            if(r!=0){
                t++;
                r--;
            }
            while(j<t && temp.next!=null){
                temp=temp.next;
                j++;
            }
            ListNode tmp=temp.next;
            temp.next=null;
            arr[i]=head;
            head=tmp;
        }
        return arr;
    }
}