// Last updated: 7/13/2026, 8:53:16 PM
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> f=new ArrayList<>();
        if(root==null){
            return f;
        }
        Queue<TreeNode> q=new LinkedList<>();
        f.add(root.val);
        int c=0;
        q.offer(root);
        while(!q.isEmpty()){
            c++;
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
            if(temp.size()>0)
            f.add(temp.get(temp.size()-1));
        }
        return f;
    }
}