// Last updated: 7/13/2026, 8:54:42 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> f=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode fin=new ListNode();
        ListNode temp1=fin;
        for(int x:map.keySet()){
            if(map.get(x)==1){
                f.add(x);
            }
        }
        Collections.sort(f);
        for(int y:f){
            ListNode a=new ListNode(y);
            temp1.next=a;
            temp1=temp1.next;
            
        }
        return fin.next;
    }
}