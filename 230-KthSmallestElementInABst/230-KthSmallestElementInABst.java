// Last updated: 7/13/2026, 8:52:59 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> li=new ArrayList<>();
        rec(root,li);
        Collections.sort(li);
        return li.get(k-1);
    }
    public void rec(TreeNode root,List<Integer> li){
        if(root==null) return;
        li.add(root.val);
        rec(root.left,li);
        rec(root.right,li);
    }
}