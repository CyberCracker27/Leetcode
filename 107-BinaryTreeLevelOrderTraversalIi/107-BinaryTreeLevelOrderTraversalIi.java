// Last updated: 7/13/2026, 8:54:24 PM
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> f=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> temp1=new ArrayList<>();
        if(root==null) return f;
        temp1.add(root.val);
        f.add(temp1);
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int x=q.size();
            for(int i=0;i<x;i++){
                TreeNode t=q.poll();
                if(t.left!=null){
                    q.offer(t.left);
                    temp.add(t.left.val);
                }
                if(t.right!=null){
                    q.offer(t.right);
                    temp.add(t.right.val);
                }
            }
            if(temp.size()>0) f.add(temp);
        }
        Collections.reverse(f);
        return f;
    }
}