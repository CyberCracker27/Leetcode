// Last updated: 7/13/2026, 8:53:59 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        rec(root,li);
        return li;
    }
    public void rec(TreeNode root,List<Integer> li){
        if(root==null) return ;
        rec(root.left,li);
        rec(root.right,li);
        li.add(root.val);
    }
}