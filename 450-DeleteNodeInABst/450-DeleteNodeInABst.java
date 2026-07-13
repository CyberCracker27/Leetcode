// Last updated: 7/13/2026, 8:52:03 PM
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.right==null && root.left==null){
                return root=null;
            }else if(root.left!=null && root.right==null){
                return root=root.left;
            }else{
                if(root.left==null) return root=root.right;
                else{
                    TreeNode temp=find_Min(root.right);
                    temp.left=root.left;
                    return root=root.right;

                }
            }
        }else if(root.val>key){
            root.left=deleteNode(root.left,key) ;
        }else{
            root.right=deleteNode(root.right,key);
        }
        return root;
    }
    public TreeNode find_Min(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}